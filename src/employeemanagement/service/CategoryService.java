package employeemanagement.service;

import employeemanagement.dto.Category;
import employeemanagement.repository.CategoryDAO;
import employeemanagement.repository.CategoryImpl;
import employeemanagement.repository.CategoryRepository;

public class CategoryService implements CategoryRepository {
       CategoryRepository categoryRepository=CategoryImpl.getInstance();
	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.addCategory(category);
	}

	@Override
	public String getCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.getCategories();
	}

	@Override
	public String deleteCategory(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.deleteCategory(id);
	}

	@Override
	public String updateCategory(Category category, int id) {
		// TODO Auto-generated method stub
		return categoryRepository.updateCategory(category, id);
	}
  
}
