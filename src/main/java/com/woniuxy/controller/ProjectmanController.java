package com.woniuxy.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniuxy.service.IProjectmanService;

@RequestMapping("/projectMan")
@Controller
public class ProjectmanController {
	
	@Resource
	private IProjectmanService service;
//	@Resource
//	private ITreeService treeServiceImpl;
//	
//	@RequestMapping("save")
//	public String save(Role role,String tids) {
//		roleServiceImpl.save(role,tids);
//		return "redirect:findAll";
//	}
//	@RequestMapping("update")
//	public String update(Role role,String tids) {
//		roleServiceImpl.update(role,tids);
//		return "redirect:findAll";
//	}
//
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List list = service.find();
		map.put("list", list);
		return "projectMan/list";
	}
//	
//	@RequestMapping("findById")
//	public String findById(Integer rid,ModelMap map) {
//		Role role = roleServiceImpl.findById(rid);
//		map.put("role", role);
//		return "forward:goInput";
//	}
//	
//	@RequestMapping("goInput")
//	public String goInput(ModelMap map) throws JsonProcessingException {
//		List list = treeServiceImpl.findAll();
//		ObjectMapper objectMapper = new ObjectMapper();
//		String json = objectMapper.writeValueAsString(list);
//		map.put("alltree", json);
//		return "/admin/role/input";
//	}
}