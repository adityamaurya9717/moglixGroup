package employeemanagement.repository;

import java.util.ArrayList;

import employeemanagement.dto.Inventory;
import employeemanagement.dto.Orders;

public class InventoryDAO {
	ArrayList<Inventory> inventories=new ArrayList<Inventory>();
	public String addInventory(Inventory inventory) {
		inventories.add(inventory);
		return "inventory added";
		
		
	}
}
