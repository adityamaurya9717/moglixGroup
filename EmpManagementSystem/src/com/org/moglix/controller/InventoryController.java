package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Inventory;
import com.org.moglix.service.InventoryService;
import com.org.moglix.service.impl.InventoryServiceImpl;

public class InventoryController {
	InventoryService inventroryService = InventoryServiceImpl.getInstance();

	public String saveOrUpdate(Inventory inventrory) {
		return this.inventroryService.saveOrUpdate(inventrory);
	}

	public Inventory getById(Long inventoryId) {
		return this.inventroryService.getById(inventoryId);
	}

	public List<Inventory> list() {
		return this.inventroryService.getList();
	}

	public String delete(Long inventoryId) {
		return this.inventroryService.deleteById(inventoryId);
	}
}
