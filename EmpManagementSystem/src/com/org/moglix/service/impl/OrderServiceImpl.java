package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.OrderDao;
import com.org.moglix.dao.impl.OrderDaoImpl;
import com.org.moglix.domain.Orders;
import com.org.moglix.service.OrderService;

public class OrderServiceImpl implements com.org.moglix.service.OrderService {
	OrderDao orderDao = OrderDaoImpl.getInstance();
	private static OrderService orderService;
	private OrderServiceImpl() {}
public static OrderService getInstance() {
	if(orderService==null) {
		orderService=new OrderServiceImpl();
		return orderService;
	}else
		return orderService;
}
	@Override
	public String saveOrUpdate(Orders order) {
		return orderDao.saveOrUpdate(order);
	}

	@Override
	public Orders getById(Long orderId) {
		return orderDao.getById(orderId);
	}

	@Override
	public List<Orders> getList() {
		return orderDao.getList();
	}

	@Override
	public String deleteById(Long orderId) {
		return orderDao.deleteById(orderId);
	}

}
