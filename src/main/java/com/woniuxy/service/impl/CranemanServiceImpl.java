package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.Craneman;
import com.woniuxy.mapper.CranemanMapper;
import com.woniuxy.service.ICranemanService;

@Service
@Transactional
public class CranemanServiceImpl implements ICranemanService{
	
	@Autowired
	private CranemanMapper cranemanMapper;

	@Override
	public void save(Craneman Craneman) {
		cranemanMapper.insertSelective(Craneman);
	}

	@Override
	public void delete(Integer cmId) {
		cranemanMapper.deleteByPrimaryKey(cmId);
	}

	@Override
	public void update(Craneman Craneman) {
		cranemanMapper.updateByPrimaryKeySelective(Craneman);
	}

	@Override
	public List<Craneman> find() {
		return cranemanMapper.selectByExample(null);
	}

	@Override
	public Craneman find(Integer cmId) {
		return cranemanMapper.selectByPrimaryKey(cmId);
	}

}
