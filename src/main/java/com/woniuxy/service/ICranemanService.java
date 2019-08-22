package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Craneman;


public interface ICranemanService {
	void save(Craneman Craneman);
	void delete(Integer cmId);
	void update(Craneman Craneman);
	List<Craneman> find();
	Craneman find(Integer cmId);
}
