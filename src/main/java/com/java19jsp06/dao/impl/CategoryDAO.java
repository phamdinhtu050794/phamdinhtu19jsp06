package com.java19jsp06.dao.impl;

import java.util.List;

import com.java19jsp06.dao.ICategoryDAO;
import com.java19jsp06.mapper.CategoryMapper;
import com.java19jsp06.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {
	
	
	
	
	public List<CategoryModel> findAll(){
		
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
		
	}
	

}
