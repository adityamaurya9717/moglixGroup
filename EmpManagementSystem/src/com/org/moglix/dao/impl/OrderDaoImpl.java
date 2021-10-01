package com.org.moglix.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.org.moglix.dao.OrderDao;
import com.org.moglix.domain.Orders;

public class OrderDaoImpl implements OrderDao {
//private static int counter=0;
//Orders orders[]=new Orders[10];
	private static OrderDao orderDao;
	private OrderDaoImpl() {}
	public static OrderDao getInstance() {
		if(orderDao==null) {
			orderDao=new OrderDaoImpl();
			return orderDao;
		}else return orderDao;
	}
	private List<Orders>orders=new ArrayList<Orders>();
	@Override
	public String saveOrUpdate(Orders order) {
		if(this.getById(order.getOrderId())!=null) {
			for (Orders orders2 : orders) {
				if(orders2!=null && orders2.getOrderId() ==order.getOrderId()) {
					orders2.setInventoryId(order.getInventoryId());
					orders2.setProductId(order.getProductId());
					orders2.setQuantity(order.getQuantity());
					orders2.setTotalPrice(order.getTotalPrice());
					orders2.setGrandTotalPrice(order.getGrandTotalPrice());
					return "Updated Successfully with orderId "+order.getOrderId()+"";
				}
				
			}
		}else {
//			if(counter<orders.length) {
//				orders[counter]=order;
//			}
			this.orders.add(order);
		}
		return "Inserted successfully" ;
	}

	@Override
	public Orders getById(Long orderId) {
		for (Orders order : orders) {
			if(order!=null && order.getOrderId()==orderId) {
				return order;
			}
		}
		return null;
	}

	@Override
	public List<Orders> getList() {
		return orders;
	}

	@Override
	public String deleteById(Long orderId) {
		Orders order=this.getById(orderId);
		if(order!=null) {
			this.orders.remove(order);
			return "Entity Deleted Successfully by orderId "+orderId+"";
		}
//		this.counter=0;
//         for (Orders order : orders) {
//			if(order!=null && order.getOrderId()==orderId) {
//				orders[counter]=null;
//				return "Deleted Successfully by orderId "+orderId+"";
//			}else {
//				counter++;
//				}
//		}
		else
         return "Deletion is not Completed ..Please try again";
	}

}
