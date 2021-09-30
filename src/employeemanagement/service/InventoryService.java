package employeemanagement.service;

import employeemanagement.dto.Inventory;
import employeemanagement.repository.InventoryDAO;
import employeemanagement.repository.InventoryImpl;
import employeemanagement.repository.InventoryRepository;

public class InventoryService implements InventoryRepository{
    InventoryRepository inventoryRepository=InventoryImpl.getInstance();
    
	@Override
	public String addInventory(Inventory inventory) {
		
		return inventoryRepository.addInventory(inventory);
	}

	@Override
	public String deleteInventory(int id) {
		
		return inventoryRepository.deleteInventory(id);
	}

	@Override
	public String updateInventory(Inventory inventory, int id) {
		
		return inventoryRepository.updateInventory(inventory, id);
	}

	@Override
	public void deleteAllInventory() {
		inventoryRepository.deleteAllInventory();
		
	}
 
}
