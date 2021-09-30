package employeemanagement.service;

import employeemanagement.dto.Catalog;
import employeemanagement.repository.CatalogDAO;

public class CatalogService {
	CatalogDAO catalogDAO=new CatalogDAO();
	public String addCatalog(Catalog catalog) {
		return catalogDAO.addCatalog(catalog);
	}

}
