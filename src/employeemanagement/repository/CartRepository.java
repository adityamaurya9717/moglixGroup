package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Cart;

public interface CartRepository {

	public String addToCart(Cart cart);
	public List<Cart> getCarts();
	public String updateCart(Cart cart,int id);
	public String deleteCartById(int id);
	public void deleteCart();
	
	
	
}
