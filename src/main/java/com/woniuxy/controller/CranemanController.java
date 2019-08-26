package com.woniuxy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.entity.Craneman;
import com.woniuxy.service.ICranemanService;

@Controller
@RequestMapping("/projectMan/craneMan")
public class CranemanController {
	@Resource
	private ICranemanService service;
	
	@RequestMapping("save")
	public String save(Craneman cm) {
		service.save(cm);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer cmId) {
		service.delete(cmId);;
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(Craneman cm) {
		service.update(cm);
		return "redirect:findAll";
	}
	

	@RequestMapping("findAll")
	public String findAll(Model model) {
		List list = service.find();
		model.addAttribute("list", list);
		return "projectMan/craneMan/list";
	}
	
	@RequestMapping("findById")
	public String findById(Integer cmId,Model model) {
		Craneman cm = service.find(cmId);
		model.addAttribute("CraneMan", cm);
		return "projectMan/craneMan/update";
	}
}
