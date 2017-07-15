package services;

import java.util.List;

import model.Cart;

public interface CartServices {
	
	public Cart findCartbyID(int id);

	public void addToCart(Cart cart);

	public List<Cart> showCart();
}
