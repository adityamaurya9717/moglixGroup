package employeemanagement.service;

import java.util.List;

import employeemanagement.dto.Catalog;
import employeemanagement.repository.CatalogDAO;
import employeemanagement.repository.CatalogImpl;
import employeemanagement.repository.CatalogRepository;

public class CatalogService implements CatalogRepository{
    CatalogRepository catalogRepository=CatalogImpl.getInstance();
	
	@Override
	public String addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return catalogRepository.addCatalog(catalog);
	}

	@Override
	public String getCatalogById(int id) {
		// TODO Auto-generated method stub
		return catalogRepository.getCatalogById(id);
	}

	@Override
	public List<Catalog> getCatalogs() {
		// TODO Auto-generated method stub
		return catalogRepository.getCatalogs();
	}

	@Override
	public String updateCatalog(Catalog catalog, int id) {
		// TODO Auto-generated method stub
		return catalogRepository.updateCatalog(catalog, id);
	}

	@Override
	public String deleteCatalogById(int id) {
		// TODO Auto-generated method stub
		return catalogRepository.deleteCatalogById(id);
	}

	@Override
	public void deleteAllCatalog() {
		// TODO Auto-generated method stub
		catalogRepository.deleteAllCatalog();
		
	}
	
}
