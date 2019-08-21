package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Embedment;
public interface IEmbedmentService {
	void save(Embedment embedment);
	void delete (Integer p3Eid);
	void update(Embedment embedment);
	List<Embedment> findAll();
	Embedment findOne(Integer p3Eid);
}
