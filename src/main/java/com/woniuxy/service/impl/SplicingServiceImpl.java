package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.Splicing;
import com.woniuxy.mapper.SplicingMapper;
import com.woniuxy.service.ISplicingService;

@Service
public class SplicingServiceImpl implements ISplicingService {
	@Resource
	private SplicingMapper splicingMapper;
	@Override
	public void save(Splicing splicing) {
		splicingMapper.insert(splicing);
	}

	@Override
	public void delete(Integer p4spid) {
		splicingMapper.deleteByPrimaryKey(p4spid);
	}

	@Override
	public void update(Splicing splicing) {
		splicingMapper.updateByPrimaryKey(splicing);
	}

	@Override
	public Splicing findOne(Integer p4spid) {
		return splicingMapper.selectByPrimaryKey(p4spid);
	}

	@Override
	public List<Splicing> findAll() {
		return splicingMapper.selectByExample(null);
	}

}
