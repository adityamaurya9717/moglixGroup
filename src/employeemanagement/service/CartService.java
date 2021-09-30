package employeemanagement.service;

import employeemanagement.dto.Cart;
import employeemanagement.repository.CartDAO;

public class CartService {
  CartDAO cartDAO=new CartDAO();
  public String addItemIntoCart(Cart cart) {
	  
	  return cartDAO.addItemToCart(cart);
	
}
}
