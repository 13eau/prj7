package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.Trailerman;
import com.woniuxy.mapper.TrailermanMapper;
import com.woniuxy.service.ITrailermanService;

@Service
@Transactional
public class TrailermanServiceImpl implements ITrailermanService {
	
	@Autowired
	private TrailermanMapper trailermanMapper;

	@Override
	public void save(Trailerman Trailerman) {
		trailermanMapper.insertSelective(Trailerman);
	}

	@Override
	public void delete(Integer tmId) {
		trailermanMapper.deleteByPrimaryKey(tmId);
	}

	@Override
	public void update(Trailerman Trailerman) {
		trailermanMapper.updateByPrimaryKeySelective(Trailerman);
	}

	@Override
	public List<Trailerman> find() {
		return trailermanMapper.selectByExample(null);
	}

	@Override
	public Trailerman find(Integer tmId) {
		return trailermanMapper.selectByPrimaryKey(tmId);
	}

}
