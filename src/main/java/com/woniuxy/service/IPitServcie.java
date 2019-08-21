package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Pit;

public interface IPitServcie {
	void save(Pit pit);
	void delete (Integer p2Pid);
	void update(Pit pit);
	List<Pit> findAll();
	Pit findOne(Integer p2pid);
}
