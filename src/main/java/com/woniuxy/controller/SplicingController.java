package com.woniuxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.woniuxy.service.ISplicingService;

@Controller
public class SplicingController {
	@Resource
	private ISplicingService splicingServiceImpl;
	
	
}
