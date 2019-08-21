package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.Pit;
import com.woniuxy.mapper.PitMapper;
import com.woniuxy.service.IPitServcie;

@Service
public class PitServcieImpl implements IPitServcie{
	@Resource
	private PitMapper PitMapper;
	@Override
	public void save(Pit pit) {
		
	}

	@Override
	public void delete(Integer p2Pid) {
		
	}

	@Override
	public void update(Pit pit) {
		
	}

	@Override
	public List<Pit> findAll() {
		return null;
	}

	@Override
	public Pit findOne(Integer p2pid) {
		return null;
	}

}
