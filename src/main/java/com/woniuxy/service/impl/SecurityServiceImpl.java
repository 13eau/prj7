package com.woniuxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.mapper.SecurityMapper;

@Service
public class SecurityServiceImpl {

	@Resource
	private SecurityMapper securityMapper;
	
}
