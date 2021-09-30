package employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import employeemanagement.dto.Orders;

public class OrdersImpl implements OrdersRepository {

	private static OrdersRepository ordersRepository;
	private OrdersImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static OrdersRepository getInstance() {
		if(ordersRepository==null) {
			ordersRepository=new OrdersImpl();
			return ordersRepository;
		}
		return ordersRepository;
	}
	
	@Override
	public String addOrders(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders getOrder(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrderById(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateOrderById(int orderid, Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
