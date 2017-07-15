package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Cart;
import model.CartItem;

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	private EntityManager em;
	
	public void addCartItem(CartItem cartItem){
		em.persist(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
       
    }

    public void removeAllCartItems(Cart cart){
      
    }

    public CartItem getCartItemByProductId(int id){
    	String sql="select * from CartItem where cartItemId=?";  
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<CartItem >(CartItem .class)); 
}
}
