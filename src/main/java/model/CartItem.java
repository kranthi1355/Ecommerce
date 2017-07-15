package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class CartItem implements Serializable {

    private static final long serialVersionUID = -904360230041854157L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartItemId;
    
    @ManyToOne
	Product product;
    
   public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

 

}
