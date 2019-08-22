package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Assemble;

public interface IAssembleService {
	void save(Assemble assemble);
	void delete(Integer p6aid);
	void update(Assemble assemble);
	Assemble findOne(Integer p6aid);
	List<Assemble> findAll();
}
