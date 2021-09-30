package employeemanagement.repository;

import employeemanagement.dto.Inventory;

public class InventoryImpl implements InventoryRepository {
  private static InventoryRepository inventoryRepository;
	
	private InventoryImpl() {
		// TODO Auto-generated constructor stub
	}
	public static InventoryRepository getInstance() {
		if(inventoryRepository==null) {
			inventoryRepository=new InventoryImpl();
			return inventoryRepository;
		}
		return inventoryRepository;
	}
	@Override
	public String addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteInventory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateInventory(Inventory inventory, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInventory() {
		// TODO Auto-generated method stub
		
	}

}
