package com.java19jsp06.dao;

import java.util.List;

import com.java19jsp06.mapper.RowMapper;



public interface GenericDAO<T> {
	
	<T> List<T> query( String sql, RowMapper<T> rowMapper, Object... parameters);

}
 