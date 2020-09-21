package com.java19jsp06.dao.impl;

import java.util.List;

import com.java19jsp06.dao.INewDAO;
import com.java19jsp06.mapper.NewMapper;
import com.java19jsp06.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		
		String sql = "SELECT * FROM news WHERE categoryid = ? ";
		return query(sql, new NewMapper(), categoryId);
		
	
	}

	@Override
	public Long save(NewModel newModel) {
		
		String sql = "INSERT INTO new (title, content, categoryid) VALUES (?, ?, ?) ";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryId());
		
	}
	
	

}
