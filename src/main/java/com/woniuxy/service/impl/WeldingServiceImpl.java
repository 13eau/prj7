package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.Welding;
import com.woniuxy.mapper.WeldingMapper;
import com.woniuxy.service.IWeldingService;

@Service
public class WeldingServiceImpl implements IWeldingService {
	@Resource
	private WeldingMapper weldingMapper;
	@Override
	public void save(Welding welding) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer p5wid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Welding welding) {
		// TODO Auto-generated method stub

	}

	@Override
	public Welding findOne(Integer p5wid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Welding> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
