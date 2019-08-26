package com.woniuxy.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.entity.Projectman;
import com.woniuxy.service.IProjectmanService;

@Controller
@RequestMapping("/projectMan")
public class ProjectmanController {
	
	@Resource
	private IProjectmanService service;
	
	@RequestMapping("save")
	public String save(Projectman pm) {
		service.save(pm);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer pmId) {
		service.delete(pmId);;
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(Projectman pm) {
		service.update(pm);
		return "redirect:findAll";
	}
	

	@RequestMapping("findAll")
	public String findAll(Model model) {
		List list = service.find();
		model.addAttribute("list", list);
		return "projectMan/list";
	}
	
	@RequestMapping("findById")
	public String findById(Integer pmId,Model model) {
		Projectman pm = service.find(pmId);
		model.addAttribute("projectMan", pm);
		return "projectMan/update";
	}
	
}