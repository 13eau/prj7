package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Trailerman;

public interface ITrailermanService {
	void save(Trailerman Trailerman);
	void delete(Integer tmId);
	void update(Trailerman Trailerman);
	List<Trailerman> find();
	Trailerman find(Integer tmId);
}
