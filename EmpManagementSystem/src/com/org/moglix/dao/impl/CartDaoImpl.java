package com.org.moglix.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.org.moglix.dao.CartDao;
import com.org.moglix.domain.Cart;

public class CartDaoImpl implements CartDao {
//	private static int counter = 0;
//	Cart carts[] = new Cart[19];

	private static CartDao cartDao;

	private CartDaoImpl() {
	}

	public static CartDao getInstance() {
		if (cartDao == null) {
			cartDao = new CartDaoImpl();
			return cartDao;
		} else
			return cartDao;
	}

	public List<Cart> carts = new ArrayList<>();

	@Override
	public String saveOrUpdate(Cart cart) {
		if (this.getById(cart.getCartId()) != null) {
			for (Cart ct : carts) {
				if (ct != null && ct.getCartId() == cart.getCartId()) {
					ct.setInventoryId(cart.getInventoryId());
					ct.setUserId(cart.getUserId());
					ct.setProductId(cart.getProductId());
					ct.setProductQuantity(cart.getProductQuantity());
					ct.setTotalPrice(cart.getTotalPrice());
				}
			}
			return "updated successfully with cartId :" + cart.getCartId() + "";
		} else {
//			if (counter < carts.length) {
//				carts[counter] = cart;
//			}
			carts.add(cart);
		}
		return "Inserted Successfully ";
	}

	@Override
	public Cart getById(Long cartId) {
		for (Cart cart : carts) {
			if (cart != null && cart.getCartId() == cartId) {
				return cart;
			}
		}
		return null;
	}

	@Override
	public List<Cart> getList() {
		return carts;
	}

	@Override
	public String deleteById(Long cartId) {
//		this.counter = 0;
//		for (Cart cart : carts) {
//			if (cart != null && cart.getCartId() == cartId) {
//				carts[counter] = null;
//				return "Deleted sucessfull deleted by id : " + cartId + "";
//			} else {
//				counter++;
//			}
//		}
//		return "Internal Server error OR catalogId may not exist";
		Cart cart = this.getById(cartId);
		if (cart != null) {
			this.carts.remove(cart);
			return "Deleted successFully";
		} else
			return "Deletaion failed";

	}

}
