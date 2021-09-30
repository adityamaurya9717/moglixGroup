package employeemanagement.service;

import employeemanagement.dto.Inventory;
import employeemanagement.repository.InventoryDAO;

public class InventoryService {
  InventoryDAO inventoryDAO=new InventoryDAO();
  public String addInventory(Inventory inventory) {
	  return inventoryDAO.addInventory(inventory);
  }
}
