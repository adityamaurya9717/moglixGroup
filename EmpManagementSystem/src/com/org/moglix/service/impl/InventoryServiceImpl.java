package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.InventoryDao;
import com.org.moglix.dao.impl.InventoryDaoImpl;
import com.org.moglix.domain.Inventory;
import com.org.moglix.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
	InventoryDao inventoryDao = InventoryDaoImpl.getInstance();
	private static InventoryService invetoryService;

	private InventoryServiceImpl() {
	}

	public static InventoryService getInstance() {
		if (invetoryService == null) {
			invetoryService = new InventoryServiceImpl();
			return invetoryService;
		} else
			return invetoryService;
	}

	@Override
	public String saveOrUpdate(Inventory inventory) {
		return inventoryDao.saveOrUpdate(inventory);
	}

	@Override
	public Inventory getById(Long inventoryId) {
		return inventoryDao.getById(inventoryId);
	}

	@Override
	public List<Inventory> getList() {
		return inventoryDao.getList();
	}

	@Override
	public String deleteById(Long inventoryId) {
		return inventoryDao.deleteById(inventoryId);
	}

}
