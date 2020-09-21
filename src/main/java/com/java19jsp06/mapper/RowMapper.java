package com.java19jsp06.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
	
	T mapRow(ResultSet rs);
}
