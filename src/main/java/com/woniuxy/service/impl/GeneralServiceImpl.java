package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.General;
import com.woniuxy.mapper.GeneralMapper;
import com.woniuxy.service.IGeneralService;

@Service
@Transactional
public class GeneralServiceImpl implements IGeneralService {
	@Resource
	private GeneralMapper generalMapper;
	
	@Override
	public void save(General general) {
		generalMapper.insertSelective(general);
	}

	@Override
	public void delete(Integer project_id) {
		generalMapper.deleteByPrimaryKey(project_id);
	}

	@Override
	public void update(General general) {
		generalMapper.updateByPrimaryKeySelective(general);
	}

	@Override
	public List<General> findAll() {
		List<General> list = generalMapper.selectByExample(null);
		return list;
	}

	@Override
	public General findOne(Integer project_id) {
		General general = generalMapper.selectByPrimaryKey(project_id);
		return general;
	}

}
