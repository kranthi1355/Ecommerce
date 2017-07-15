package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDao;
import model.Cart;
import model.CartItem;
import model.Product;
import model.User;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	ProductDao productDao;

	public void saveProduct(Product product) {
		productDao.saveProduct(product);

	}

	public List<Product> showProduct() {

		return productDao.showProduct();
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);

	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);

	}


	public void findProductbyID(int id, String sessionValue) {
		
		Product product=productDao.findProductbyID(id);
		System.out.println("userName = "+sessionValue);
		
		User user= productDao.findIdForUser(sessionValue);
		long userId = user.getId();
		List<Cart> cartList =productDao.findCartForUser(userId);
		
        if(cartList.size() < 1){
        	Cart cart = new Cart();
        	CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			
			List<CartItem> cartItemsList = new ArrayList<CartItem>();
			
			cartItemsList.add(cartItem);
			cart.setUser(user);
			cart.setProductsList(cartItemsList);
			productDao.saveCartItem(cartItem);
			productDao.addToCart(cart);
		}else{
			System.out.println("Cart is available for "+user);
			
			Cart userCart = cartList.get(0);
			CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			List<CartItem> cartItemsList = new ArrayList<CartItem>();
			cartItemsList.add(cartItem);
			userCart.setProductsList(cartItemsList);
			productDao.saveCartItem(cartItem);
			productDao.addToCart(userCart);
		}
		
	}

	public Product productbyID(int id) {
		return productDao.findProductbyID(id);
		
	}

}
