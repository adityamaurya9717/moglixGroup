package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Cart;

public class CartImpl implements CartRepository {

	 private static CartRepository cartRepository;
	private CartImpl() {
		// TODO Auto-generated constructor stub
	}
	public static CartRepository getInstance() {
		if(cartRepository==null) {
			cartRepository=new CartImpl();
			return cartRepository;
		}
		return  cartRepository;
	}
	
	
	@Override
	public String addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCart(Cart cart, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCartById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCart() {
		// TODO Auto-generated method stub

	}

}
