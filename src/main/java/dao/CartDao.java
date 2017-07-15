package dao;

import java.util.List;

import model.Cart;

public interface CartDao {
	public Cart findCartbyID(int id);
	public void addToCart(Cart cart);
	public List<Cart> showCart();
}
