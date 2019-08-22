package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Constructionman;

public interface IconstructionManService {
	public void save(Constructionman constructionman);
	public void delete(int cscId);
	public void update(Constructionman constructionman);
	
	public List<Constructionman> findAll();
	public Constructionman findById(Integer cscId);
	public List<Constructionman> findByStatus(String status);
	public List<Constructionman> findByForeman(Integer fmId);
	public List<Constructionman> findByCompany(Integer company); 
}
