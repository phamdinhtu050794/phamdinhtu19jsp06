package com.java19jsp06.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.java19jsp06.dao.INewDAO;
import com.java19jsp06.model.NewModel;
import com.java19jsp06.service.INewService;

public class NewService implements INewService{
	
	@Inject
	private INewDAO newDao;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		
		return newDao.findByCategoryId(categoryId);
	}

}
