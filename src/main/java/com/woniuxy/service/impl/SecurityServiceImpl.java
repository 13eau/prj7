package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.entity.Security;
import com.woniuxy.mapper.SecurityMapper;
import com.woniuxy.service.ISecurityService;

@Service
public class SecurityServiceImpl implements ISecurityService {

	@Resource
	private SecurityMapper securityMapper;

	@Override
	@Transactional(readOnly = false)
	public void save(Security security) {
		securityMapper.insertSelective(security);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer plSid) {
		
	}

	@Override
	@Transactional(readOnly = false)
	public void update(Security security) {
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Security> findAll() {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Security findOne(Integer plSid) {
		return null;
	}
	
}
