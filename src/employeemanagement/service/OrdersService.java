package employeemanagement.service;

import java.util.List;

import employeemanagement.dto.Orders;
import employeemanagement.repository.OrdersDAO;
import employeemanagement.repository.OrdersImpl;
import employeemanagement.repository.OrdersRepository;

public class OrdersService implements OrdersRepository {
  OrdersRepository ordersRepository=OrdersImpl.getInstance();
	@Override
	public String addOrders(Orders order) {
		// TODO Auto-generated method stub
		return ordersRepository.addOrders(order);
	}

	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		return ordersRepository.getOrders();
	}

	@Override
	public Orders getOrder(int orderid) {
		// TODO Auto-generated method stub
		return ordersRepository.getOrder(orderid);
	}

	@Override
	public String deleteOrderById(int orderid) {
		// TODO Auto-generated method stub
		return ordersRepository.deleteOrderById(orderid);
	}

	@Override
	public String updateOrderById(int orderid, Orders orders) {
		// TODO Auto-generated method stub
		return ordersRepository.updateOrderById(orderid, orders);
	}
	

}
