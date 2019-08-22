package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.Assemble;
import com.woniuxy.mapper.AssembleMapper;
import com.woniuxy.service.IAssembleService;

@Service
public class AssembleServiceImpl implements IAssembleService {
	@Resource
	private AssembleMapper assembleMapper;
	@Override
	public void save(Assemble assemble) {
		
	}

	@Override
	public void delete(Integer p6aid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Assemble assemble) {
		// TODO Auto-generated method stub

	}

	@Override
	public Assemble findOne(Integer p6aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Assemble> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
