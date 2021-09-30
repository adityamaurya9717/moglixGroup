package employeemanagement.service;

import employeemanagement.dto.Orders;
import employeemanagement.repository.OrdersDAO;

public class OrdersService {
	OrdersDAO ordersDAO=new OrdersDAO();
	public String addOrders(Orders order) {
		return ordersDAO.addOrders(order);
	}

}
