package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.PaintingStock;

public interface IPainting_StockService {
	void save(PaintingStock paintingStock,Integer p7_ptid, Integer sid);
	void delete (Integer p7_ptid,Integer sid);
	void update(PaintingStock paintingStock);
	List<PaintingStock> findAll();
	PaintingStock findOne(Integer p7_ptid,Integer sid);
}
