package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CartDao;
import model.Cart;

public class CartServicesImpl implements CartServices {

	@Autowired
	CartDao cartDao;
	
	public Cart findCartbyID(int id) {
		
		return cartDao.findCartbyID(id);
	}

	public void addToCart(Cart cart) {
		cartDao.addToCart(cart);
		
	}

	public List<Cart> showCart() {
		return cartDao.showCart();
	}


}
