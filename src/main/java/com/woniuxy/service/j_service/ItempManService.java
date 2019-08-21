package com.woniuxy.service.j_service;

import java.util.List;

import com.woniuxy.entity.Tempman;

public interface ItempManService {
	public void save(int tempId,Tempman tempman);
	public void delete(int tempId);
	public void update(Tempman tempman);
	
	public List<Tempman> findAll();
	public Tempman findById(Integer tempId);
	public List<Tempman> findByStatus(String status);
	public List<Tempman> findByForeman(Integer fmId);
	public List<Tempman> findByCompany(Integer company); 
}
