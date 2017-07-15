package dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Cart;
import model.CartItem;
import model.Product;
import model.User;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	private EntityManager em;

	HashMap<Integer, User> hashMap = new HashMap<Integer, User>();
	
	public void saveProduct(Product product) {
		
		em.persist(product);
		
	}	
	
public List<Product> showProduct(){
	
	List<Product> list=em.createQuery("SELECT a FROM Product a", Product.class).getResultList();
			return list;
	}

public void updateProduct(Product product) {
	
	String sql = "update product set productName =?,productDescription=?, productPrice=? where id=?";
	jdbcTemplate.update(sql, new Object[] { product.getProductName(), product.getProductDescription(),product.getProductPrice(), product.getId() });
	
}

public void deleteProduct(int id) {
	
	Product del = em.getReference(Product.class, id);
	em.remove(del);
	
}
public Product findProductbyID(int id) {
	return em.find(Product.class, id);
}

public User findIdForUser(String sessionValue) {
	String sql = "from User where userName='"+sessionValue+"'";
	List<User> userList = em.createQuery(sql).getResultList();
	return userList.get(0);
}

public List<Cart> findCartForUser(long userId) {
	String sql = "from Cart where id='"+userId+"'";
	List<Cart> userList = em.createQuery(sql).getResultList();
	return userList;
}

public void saveCartItem(CartItem cartItem) {
	em.persist(cartItem);
	
}

public void addToCart(Cart cart) {
	em.persist(cart);
	
}


}
