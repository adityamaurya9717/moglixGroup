package com.org.moglix.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.org.moglix.dao.CategoryDao;
import com.org.moglix.domain.Category;

public class CategoryDaoImpl implements CategoryDao {
//private static int counter=0;
//Category categories[]=new Category[16];
	private static CategoryDao categoryDao;

	private CategoryDaoImpl() {
	}

	public static CategoryDao getInstance() {
		if (categoryDao == null) {
			categoryDao = new CategoryDaoImpl();
			return categoryDao;
		} else
			return categoryDao;
	}

	private List<Category> categories = new ArrayList<Category>();

	@Override
	public String saveOrUpdate(Category category) {
		if (this.getById(category.getCategoryId()) != null) {
			for (Category cat : categories) {
				if (cat.getCategoryId() == category.getCategoryId()) {
					cat.setCategoryName(category.getCategoryName());
					return "Updated Successfully ";
				}
			}
		} else {
//			if(counter<categories.length) {
//				categories[counter]=category;
//			}
			this.categories.add(category);
		}
		return "Inserted Successfully";
	}

	@Override
	public Category getById(Long categyId) {
		for (Category category : categories) {
			if (category != null && category.getCategoryId() == categyId) {
				return category;
			}
		}
		return null;
	}

	@Override
	public List<Category> getList() {
		return categories;
	}

	@Override
	public String deleteById(Long categoryId) {
		Category category = this.getById(categoryId);
		if (category != null) {
			this.categories.remove(category);
			return "Deleted Successfull with categoryId " + categoryId + "";
		} else
			return "Internal Server error OR catalogId may not exist";

//		this.counter=0;
//		for (Category category : categories) {
//		if(category!=null && category.getCategoryId()==categoryId) {
//			categories[counter]=null;
//			return "Deleted Successfull with categoryId "+categoryId+"";
//		}else {
//			counter++;
//		}
//	}
//	       return "Internal Server error OR catalogId may not exist";
	}

}
