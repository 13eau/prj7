package com.woniuxy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.entity.Trailerman;
import com.woniuxy.service.ITrailermanService;

@RequestMapping("/projectMan/trailerMan")
@Controller
public class TrailermanController {
	@Resource
	private ITrailermanService service;
	
	@RequestMapping("save")
	public String save(Trailerman tm) {
		service.save(tm);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer tmId) {
		service.delete(tmId);;
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(Trailerman tm) {
		service.update(tm);
		return "redirect:findAll";
	}
	

	@RequestMapping("findAll")
	public String findAll(Model model) {
		List list = service.find();
		model.addAttribute("list", list);
		return "projectMan/trailerMan/list";
	}
	
	@RequestMapping("findById")
	public String findById(Integer tmId,Model model) {
		Trailerman tm = service.find(tmId);
		model.addAttribute("CraneMan", tm);
		return "projectMan/trailerMan/update";
	}
}
