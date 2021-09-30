package employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import employeemanagement.dto.Orders;

public class OrdersDAO {

	ArrayList<Orders> orders=new ArrayList<Orders>();
	public String addOrders(Orders order) {
		
		orders.add(order);
		return "order added";
	}
	
	public List<Orders> getOrders(){
		return orders;
		
	}
	public Orders getOrder(int orderid) {
		int i=serachOrderById(orderid);
		if(i!=-1) return orders.get(i);
		return null;
	}
	
	public String deleteOrderById(int orderid) {
		int i=serachOrderById(orderid);
		if(i!=-1) { 
			orders.remove(i);
			return "deleted successfully";
			
		}
		return "orders not present";
	}
	
	
	
	private int serachOrderById(int id) {
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getOrderId()==id) {
				return i;
			}
			
		 }
		
		return -1;
	}
	
}
