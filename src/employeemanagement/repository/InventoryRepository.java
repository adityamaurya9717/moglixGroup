package employeemanagement.repository;

import employeemanagement.dto.Inventory;

public interface InventoryRepository {
	public String addInventory(Inventory inventory);
	public String deleteInventory(int id);
	public String updateInventory(Inventory inventory,int id);
	public void deleteAllInventory();
	
}
