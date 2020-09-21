package com.java19jsp06.dao;

import java.util.List;

import com.java19jsp06.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	
	

}
