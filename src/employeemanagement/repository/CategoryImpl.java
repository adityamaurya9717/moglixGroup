package employeemanagement.repository;

import employeemanagement.dto.Category;

public class CategoryImpl implements CategoryRepository {

	private static CategoryRepository categoryRepository;
	private CategoryImpl() {
		// TODO Auto-generated constructor stub
	}
	public static CategoryRepository getInstance() {
		if(categoryRepository==null) {
			categoryRepository=new CategoryImpl();
			return categoryRepository;
		}
		return categoryRepository;
		
	}
	
	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCategory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCategory(Category category, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
