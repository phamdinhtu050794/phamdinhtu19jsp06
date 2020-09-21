package com.java19jsp06.service;

import java.util.List;

import com.java19jsp06.model.NewModel;

public interface INewService {
	
	List<NewModel> findByCategoryId(Long categoryId);

}
