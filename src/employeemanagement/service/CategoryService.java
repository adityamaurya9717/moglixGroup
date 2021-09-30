package employeemanagement.service;

import employeemanagement.dto.Category;
import employeemanagement.repository.CategoryDAO;

public class CategoryService {
  CategoryDAO categoryDAO=new CategoryDAO();
  public String addCategory(Category category) {
	return categoryDAO.addCategories(category);
   }
}
