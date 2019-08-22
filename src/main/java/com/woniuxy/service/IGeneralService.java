package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.General;

public interface IGeneralService {
	void save(General general);
	void delete (Integer project_id);
	void update(General general);
	List<General> findAll();
	General findOne(Integer project_id);
	
}
