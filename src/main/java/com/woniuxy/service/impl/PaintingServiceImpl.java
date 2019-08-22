package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.General;
import com.woniuxy.entity.Painting;
import com.woniuxy.mapper.GeneralMapper;
import com.woniuxy.mapper.PaintingMapper;
import com.woniuxy.service.IGeneralService;
import com.woniuxy.service.IPaintingService;

@Service
public class PaintingServiceImpl implements IPaintingService {
	@Resource
	private PaintingMapper paintingMapper;

	@Override
	public void save(Painting painting) {
		paintingMapper.insertSelective(painting);
	}

	@Override
	public void delete(Integer p7_ptid) {
		paintingMapper.deleteByPrimaryKey(p7_ptid);
	}

	@Override
	public void update(Painting painting) {
		paintingMapper.updateByPrimaryKeySelective(painting);
	}

	@Override
	public List<Painting> findAll() {
		List<Painting> list = paintingMapper.selectByExample(null);
		return list;
	}

	@Override
	public Painting findOne(Integer p7_ptid) {
		Painting painting = paintingMapper.selectByPrimaryKey(p7_ptid);
		return painting;
	}



}
