package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.entity.Embedment;
import com.woniuxy.mapper.EmbedmentMapper;
import com.woniuxy.service.IEmbedmentService;

@Service
public class EmbedmentServiceImpl implements IEmbedmentService {
	@Resource
	private EmbedmentMapper EmbedmentMapper;

	@Override
	public void save(Embedment embedment) {

	}

	@Override
	public void delete(Integer p3Eid) {

	}

	@Override
	public void update(Embedment embedment) {

	}

	@Override
	public List<Embedment> findAll() {
		return null;
	}

	@Override
	public Embedment findOne(Integer p3Eid) {
		return null;
	}

}
