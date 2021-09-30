package employeemanagement.repository;

import java.util.ArrayList;

import employeemanagement.dto.Category;
import employeemanagement.dto.Orders;

public class CategoryDAO {
	ArrayList<Category> categories=new ArrayList<Category>();
	public String addCategories(Category category) {
		
		categories.add(category);
		return "category added";
	}

}
