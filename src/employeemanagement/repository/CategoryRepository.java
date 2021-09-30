package employeemanagement.repository;

import employeemanagement.dto.Category;

public interface CategoryRepository {
	public String addCategory(Category category);
	public String getCategories();
	public String deleteCategory(int id);
	public String updateCategory(Category category,int id);
		
	

}
