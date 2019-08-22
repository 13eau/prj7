package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Projectman;


public interface IProjectmanService {
	void save(Projectman projectman);
	void delete(Integer pmId);
	void update(Projectman projectman);
	List<Projectman> find();
	Projectman find(Integer pmId);
}
