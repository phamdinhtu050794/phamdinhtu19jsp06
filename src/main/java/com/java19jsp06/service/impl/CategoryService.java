package com.java19jsp06.service.impl;

 
import java.util.List;

import javax.inject.Inject;

import com.java19jsp06.dao.ICategoryDAO;
import com.java19jsp06.model.CategoryModel;
import com.java19jsp06.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	 
//	private ICategoryDAO categoryDao;
	
//	public CategoryService() {
//		
//		categoryDao = new CategoryDAO();
//	}
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDao.findAll();
	}

}
