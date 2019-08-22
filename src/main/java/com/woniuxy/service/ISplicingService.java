package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Splicing;

public interface ISplicingService {
	void save(Splicing splicing);
	void delete(Integer p4spid);
	void update(Splicing splicing);
	Splicing findOne(Integer p4spid);
	List<Splicing> findAll();
}
