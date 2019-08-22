package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.PaintingStock;
import com.woniuxy.entity.PaintingStockExample;
import com.woniuxy.mapper.PaintingStockMapper;
import com.woniuxy.service.IPainting_StockService;


@Service
@Transactional
public class Painting_StockServiceImpl implements IPainting_StockService {
	@Resource
	private PaintingStockMapper paintingStockMapper;
	@Override
	public void save(PaintingStock paintingStock,Integer p7_ptid, Integer sid) {
		PaintingStockExample p = new PaintingStockExample();
		
	}

	@Override
	public void delete(Integer p7_ptid, Integer sid) {
		PaintingStockExample p = new PaintingStockExample();
		p.or().andP7PtidEqualTo(p7_ptid).andSidEqualTo(sid);
		paintingStockMapper.deleteByExample(p);
	}

	@Override
	public void update(PaintingStock paintingStock) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PaintingStock> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaintingStock findOne(Integer p7_ptid, Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
