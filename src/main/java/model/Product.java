package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Product")
public class Product {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Column
	private String productName;
	
	@Column
	private String productDescription;
	
	@Column
	private int productPrice;

	
}
