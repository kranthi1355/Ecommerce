package controllers;  
  
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import model.User;
import services.CartServices;
import services.ProductServices;
import services.UserServices;

@Controller  
public class UserController {  
	
	@Autowired
	 UserServices userServices;
	
	@Autowired
	 ProductServices productServices;
	
	@Autowired
	 CartServices cartServices;
	
	
//	This is for index page.
    @RequestMapping("/addUser")  
    public ModelAndView showform(){  
        return new ModelAndView("addUser","user",new User());  
    }  
    
    
//    This is for addUser Page
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("user") @Valid User user,BindingResult result){  
    	if (result.hasErrors()) {
    		 return new ModelAndView("addUser");
    	}
    	else {    	 
    		userServices.saveUser(user);
    		return new ModelAndView("redirect:/viewUser");
    		}
    	}  
    
//    This is for update
    @RequestMapping(value="/update/{id}")  
    public ModelAndView edit(@PathVariable long id){   
        User user=userServices.findUserbyID(id);
        return new ModelAndView("updateUser","command",user);     
    } 
    
    @RequestMapping(value="/saveUpdate", method = RequestMethod.POST)  
    public ModelAndView update(@ModelAttribute("update") User user){   
    	userServices.updateUser(user);
		return new ModelAndView("redirect:/viewUser");  
    } 
    
  
    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable long id){   
    	userServices.deleteUser(id);
    	return new ModelAndView("redirect:/viewUser"); 
   } 
    
    
    @RequestMapping("/viewUser")  
    public ModelAndView viewemp(){
    	
    	List<User> listUser = userServices.showUser(); 
    	System.out.println(listUser);
		return new ModelAndView("viewUser","listUser",listUser);
    }  
    
    @RequestMapping("/loginUser")  
    public ModelAndView loginUser(){  
        return new ModelAndView("loginUser","login",new User());  
    }
    @RequestMapping(value="/login", method = RequestMethod.POST)  
    public ModelAndView login(@ModelAttribute("login") User user,HttpSession session){  
    	
    	if (userServices.validateLogin(user))	
    	{
    		session.setAttribute("loggeduser",user.getUserName());
    		
    		return new ModelAndView("redirect:/home"); 
    	}
        else
        	return new ModelAndView("redirect:/notlogin");
    }
    
    @RequestMapping("/notlogin")  
    public ModelAndView notlogin(){  
        return new ModelAndView("notlogin","user",new User());  
    }
  //  This is for index page.
    @RequestMapping("/home")  
    public ModelAndView home(){  
    	
    	List<Product> listProduct = productServices.showProduct(); 
		return new ModelAndView("home","listProduct",listProduct); 
    }
}  