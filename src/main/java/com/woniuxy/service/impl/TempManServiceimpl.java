package com.woniuxy.service.impl;


import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.entity.Constructionman;
import com.woniuxy.entity.ConstructionmanExample;
import com.woniuxy.entity.Tempman;
import com.woniuxy.entity.TempmanExample;
import com.woniuxy.mapper.TempmanMapper;
import com.woniuxy.service.ItempManService;

public class TempManServiceimpl implements ItempManService{
	@Resource
	private TempmanMapper tempmanmapper;
	@Override
	public void save(Tempman tempman) {
		// TODO Auto-generated method stub
		tempmanmapper.insert(tempman);
	}

	@Override
	public void delete(int tempId) {
		// TODO Auto-generated method stub
		tempmanmapper.deleteByPrimaryKey(tempId);
	}

	@Override
	public void update(Tempman tempman) {
		// TODO Auto-generated method stub
		tempmanmapper.updateByPrimaryKeySelective(tempman);
	}

	@Override
	public List<Tempman> findAll() {
		// TODO Auto-generated method stub
		return tempmanmapper.selectByExample(null);
	}

	@Override
	public Tempman findById(Integer tempId) {
		// TODO Auto-generated method stub
		return tempmanmapper.selectByPrimaryKey(tempId);
	}

	@Override
	public List<Tempman> findByStatus(String status) {
		// TODO Auto-generated method stub
		TempmanExample example = new TempmanExample();
		example.createCriteria().andStatusEqualTo(status);
		List<Tempman> list = tempmanmapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Tempman> findByForeman(Integer fmId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tempman> findByCompany(Integer company) {
		// TODO Auto-generated method stub
		TempmanExample example = new TempmanExample();
		example.createCriteria().andCompanyEqualTo(company);
		List<Tempman> list = tempmanmapper.selectByExample(example);
		return list;
	}

}
