package employeemanagement.repository;

import java.util.ArrayList;

import employeemanagement.dto.Cart;
import employeemanagement.dto.Category;

public class CartDAO {
	ArrayList<Cart> carts=new ArrayList<Cart>();
	public String addItemToCart(Cart cart) {
		
		carts.add(cart);
		return "item added into cart";
	}
	
	
}