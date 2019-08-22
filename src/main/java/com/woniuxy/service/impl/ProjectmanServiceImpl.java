package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.Projectman;
import com.woniuxy.mapper.ProjectmanMapper;
import com.woniuxy.service.IProjectmanService;

@Service
@Transactional
public class ProjectmanServiceImpl implements IProjectmanService {
	
	@Autowired
	private ProjectmanMapper projectmanMapper;

	@Override
	public void save(Projectman projectman) {
		projectmanMapper.insert(projectman);
	}

	@Override
	public void delete(Integer pmId) {
		projectmanMapper.deleteByPrimaryKey(pmId);
	}

	@Override
	public void update(Projectman projectman) {
		projectmanMapper.updateByPrimaryKeySelective(projectman);
	}

	@Override
	public List<Projectman> find() {
		return projectmanMapper.selectByExample(null);
	}

	@Override
	public Projectman find(Integer pmId) {
		return projectmanMapper.selectByPrimaryKey(pmId);
	}

}
