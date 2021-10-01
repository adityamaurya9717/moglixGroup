package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.CartDao;
import com.org.moglix.dao.impl.CartDaoImpl;
import com.org.moglix.domain.Cart;
import com.org.moglix.service.CartService;

public class CartServiceImpl implements CartService {
	CartDao cartDao = CartDaoImpl.getInstance();
	private static CartService cartService;

	private CartServiceImpl() {
	}

	public static CartService getInstance() {
		if (cartService == null) {
			cartService = new CartServiceImpl();
			return cartService;
		} else
			return cartService;
	}

	@Override
	public String saveOrUpdate(Cart cart) {
		return cartDao.saveOrUpdate(cart);
	}

	@Override
	public Cart getById(Long cartId) {
		return this.cartDao.getById(cartId);
	}

	@Override
	public List<Cart> getList() {
		return this.cartDao.getList();
	}

	@Override
	public String deleteById(Long cartId) {
		return this.cartDao.deleteById(cartId);
	}

}
