package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.entity.Constructionman;
import com.woniuxy.mapper.ConstructionmanMapper;
import com.woniuxy.service.IconstructionManService;

public class ConstructionManServiceimpl  implements IconstructionManService{
	@Resource
	private ConstructionmanMapper constructionmapper;
	@Override
	public void save(Constructionman constructionman) {
		// TODO Auto-generated method stub
		constructionmapper.insert(constructionman);
	}

	@Override
	public void delete(int cscId) {
		// TODO Auto-generated method stub
		constructionmapper.deleteByPrimaryKey(cscId);
	}

	@Override
	public void update(Constructionman constructionman) {
		// TODO Auto-generated method stub
		constructionmapper.updateByPrimaryKeySelective(constructionman);
	}

	@Override
	public List<Constructionman> findAll() {
		// TODO Auto-generated method stub
		return constructionmapper.selectByExample(null);
	}

	@Override
	public Constructionman findById(Integer cscId) {
		// TODO Auto-generated method stub
		return constructionmapper.selectByPrimaryKey(cscId);
	}

	@Override
	public List<Constructionman> findByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Constructionman> findByForeman(Integer fmId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Constructionman> findByCompany(Integer company) {
		// TODO Auto-generated method stub
		return null;
	}

}
