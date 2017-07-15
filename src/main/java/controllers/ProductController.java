package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import services.CartServices;
import services.ProductServices;
import services.UserServices;


@Controller 
public class ProductController {
	
	@Autowired
	 UserServices userServices;
	
	@Autowired
	 ProductServices productServices;
	
	@Autowired
	 CartServices cartServices;
	
	
	@RequestMapping("/addProduct")  
    public ModelAndView product(){  
        return new ModelAndView("addProduct","product",new Product());  
    } 
    
    @RequestMapping(value="/saveProduct",method = RequestMethod.POST)  
    public ModelAndView saveProduct(@ModelAttribute("product") Product product){
    	
    	productServices.saveProduct(product);
    	return new ModelAndView("redirect:/viewProduct"); 
     }
    
    @RequestMapping("/viewProduct")  
    public ModelAndView viewproduct(){
    	
    	List<Product> listProduct = productServices.showProduct(); 
    	System.out.println(listProduct);
		return new ModelAndView("viewProduct","listProduct",listProduct);
    } 
	 
	 @RequestMapping(value="/updateProduct/{id}")
	 public ModelAndView editProduct(@PathVariable int id) {
		 Product product=productServices.productbyID(id);
		 return new ModelAndView("updateProduct","command",product);
	 }
	 
	  @RequestMapping(value="/updateProduct", method = RequestMethod.POST)  
	    public ModelAndView updateProduct(@ModelAttribute("update") Product product){   
	    	productServices.updateProduct(product);
			return new ModelAndView("redirect:/viewProduct");  
	    } 
    @RequestMapping(value="/deleteProduct/{id}",method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id)
    {
    	productServices.deleteProduct(id);
    	return new ModelAndView("redirect:/viewProduct"); 
    }
}
