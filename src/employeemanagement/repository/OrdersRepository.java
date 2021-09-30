package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Orders;

public interface OrdersRepository {
	public String addOrders(Orders order);
	public List<Orders> getOrders();
	public Orders getOrder(int orderid) ;
	public String deleteOrderById(int orderid);
	public String updateOrderById(int orderid,Orders orders);
	
}
