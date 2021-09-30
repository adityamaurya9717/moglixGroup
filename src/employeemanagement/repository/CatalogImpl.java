package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Catalog;

public class CatalogImpl implements CatalogRepository {

	
	private static CatalogRepository catalogRepository;
	private CatalogImpl() {
		// TODO Auto-generated constructor stub
	}
	public static CatalogRepository getInstance() {
		if (catalogRepository==null) {
			catalogRepository=new CatalogImpl();
			return catalogRepository;
			
		}
		return catalogRepository;
		
	}
	@Override
	public String addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCatalogById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Catalog> getCatalogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCatalog(Catalog catalog, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCatalogById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCatalog() {
		// TODO Auto-generated method stub

	}

}
