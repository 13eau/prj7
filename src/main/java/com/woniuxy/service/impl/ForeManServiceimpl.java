package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.entity.Foreman;
import com.woniuxy.mapper.ForemanMapper;
import com.woniuxy.service.IforeManService;

public class ForeManServiceimpl implements IforeManService {
	@Resource
	private ForemanMapper foremanMapper;
	@Override
	public void save(Foreman foreman) {
		// TODO Auto-generated method stub
		foremanMapper.insert(foreman);
	}

	@Override
	public void delete(int fmId) {
		// TODO Auto-generated method stub
		foremanMapper.deleteByPrimaryKey(fmId);
	}

	@Override
	public void update(Foreman foreman) {
		// TODO Auto-generated method stub
		foremanMapper.updateByPrimaryKeySelective(foreman);
	}

	@Override
	public List<Foreman> findAll() {
		// TODO Auto-generated method stub
		return foremanMapper.selectByExample(null);
	}

	@Override
	public Foreman findById(Integer fmId) {
		// TODO Auto-generated method stub
		return foremanMapper.selectByPrimaryKey(fmId);
	}

	@Override
	public List<Foreman> findByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Foreman> findByCompany(Integer company) {
		// TODO Auto-generated method stub
		return null;
	}

}
