package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = -2054386655979281969L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartId;
	
	@OneToOne
	@JoinColumn(name = "id")
	User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<CartItem> productsList) {
		this.productsList = productsList;
	}

	@OneToMany
	List<CartItem> productsList ;

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}


}
