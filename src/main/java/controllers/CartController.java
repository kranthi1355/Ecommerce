package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Cart;
import services.CartServices;
import services.ProductServices;
import services.UserServices;

@Controller 
public class CartController {

	@Autowired
	 UserServices userServices;
	
	@Autowired
	 ProductServices productServices;
	
	@Autowired
	 CartServices cartServices;
	
	@RequestMapping(value="/addToCart/{id}")  
	    public ModelAndView addToCart (@PathVariable int id,HttpSession session,HttpServletRequest request, HttpServletResponse response){
		 		 
		 session=request.getSession(true);
		 String sessionValue=(String)session.getAttribute("loggeduser");
		 
		 productServices.findProductbyID(id,sessionValue);
		   return new ModelAndView("home"); 
		
	    } 
	 @RequestMapping(value="/mycart")  
	    public ModelAndView showCart (){
		 List<Cart> listCart = cartServices.showCart(); 
	    	System.out.println(listCart);
			return new ModelAndView("mycart","listCart",listCart);      
	    } 
	
}
