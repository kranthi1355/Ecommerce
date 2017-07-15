package services;

import java.util.List;

import model.Product;


public interface ProductServices {
	public void saveProduct(Product product);
	public List<Product> showProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public Product productbyID(int id);
	public void findProductbyID(int id, String sessionValue);

}
