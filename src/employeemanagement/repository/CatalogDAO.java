package employeemanagement.repository;

import java.util.ArrayList;

import employeemanagement.dto.Catalog;
import employeemanagement.dto.Category;

public class CatalogDAO {
	
	ArrayList<Catalog> catalogs=new ArrayList<Catalog>();
	public String addCatalog(Catalog catalog) {
		
		catalogs.add(catalog);
		return "catalog added";
	}

}
