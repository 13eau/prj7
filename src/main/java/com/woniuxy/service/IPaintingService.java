package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Painting;

public interface IPaintingService {
	void save(Painting painting);
	void delete (Integer p7_ptid);
	void update(Painting painting);
	List<Painting> findAll();
	Painting findOne(Integer p7_ptid);
}
