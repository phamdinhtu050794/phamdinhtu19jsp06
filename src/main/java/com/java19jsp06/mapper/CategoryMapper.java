package com.java19jsp06.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.java19jsp06.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			return category;
			
		} catch (SQLException e) {
			return null;
			
			
		}
		
	}

}
