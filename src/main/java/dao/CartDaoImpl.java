package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Cart;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	private EntityManager em;

	public Cart findCartbyID(int id) {
		String sql="select * from Cart where cartId=?";  
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Cart>(Cart.class)); 
        
	}

	public void addToCart(Cart cart) {
		
		em.merge(cart);
		
	}

	public List<Cart> showCart() {
		List<Cart> list=em.createQuery("SELECT a FROM Cart a", Cart.class).getResultList();
		return list;
	}


}
