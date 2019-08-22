package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Welding;

public interface IWeldingService {
	void save(Welding welding);
	void delete(Integer p5wid);
	void update(Welding welding);
	Welding findOne(Integer p5wid);
	List<Welding> findAll();
}
