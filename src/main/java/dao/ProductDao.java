package dao;

import java.util.List;

import model.Cart;
import model.CartItem;
import model.Product;
import model.User;

public interface ProductDao {

	public void saveProduct(Product product);
	public List<Product> showProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public Product findProductbyID(int id);
	public User findIdForUser(String sessionValue);
	public List<Cart> findCartForUser(long userId);
	public void saveCartItem(CartItem cartItem);
	public void addToCart(Cart cart);
}
