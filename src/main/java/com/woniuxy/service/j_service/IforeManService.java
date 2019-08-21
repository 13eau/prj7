package com.woniuxy.service.j_service;

import java.util.List;

import com.woniuxy.entity.Foreman;

public interface IforeManService {
	public void save(int fmId,Foreman foreman);
	public void delete(int fmId);
	public void update(Foreman foreman);
	
	public List<Foreman> findAll();
	public Foreman findById(Integer fmId);
	public List<Foreman> findByStatus(String status);
	public List<Foreman> findByCompany(Integer company);
}
