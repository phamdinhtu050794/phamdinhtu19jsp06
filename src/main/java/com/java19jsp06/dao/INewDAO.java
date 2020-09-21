package com.java19jsp06.dao;

import java.util.List;

import com.java19jsp06.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);

}
