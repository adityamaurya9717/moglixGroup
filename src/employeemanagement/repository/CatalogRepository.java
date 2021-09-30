package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Catalog;

public interface CatalogRepository {
	public String addCatalog(Catalog catalog);
	public String getCatalogById(int id);
	public List<Catalog> getCatalogs();
	public String updateCatalog(Catalog  catalog,int id);
	public String deleteCatalogById(int id);
	public void deleteAllCatalog();
	

}
