package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.pojo.Emp;
import com.tedu.service.DoorService;
import com.tedu.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	@Autowired
	private DoorService doorService;
	
	@RequestMapping("/empList")
	public String EmpFindAll(Model model) {
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("doorList", doorList);
		List<Emp> empList = empService.empFindAll();
		model.addAttribute("empList", empList);
		return "emp_list";
	}
	@RequestMapping("/toEmpAdd")
	public String doorFindAll(Model model) {
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("doorList", doorList);
		return "emp_add";
	}
	
	@RequestMapping("/empAdd")
	public String empInsert(Emp emp) {
		System.out.println(emp);
		empService.empInsert(emp);
		return "forward:/empList";
	}
	@RequestMapping("empDelete")
	public String empDaleteById(Integer id) {
		empService.empDeleteById(id);
		return "forward:/empList";
	}
	@RequestMapping("/empInfo")
	public String empFindById(Integer id,Model model) {
		Emp emp = empService.empFindById(id);
		model.addAttribute("emp", emp);
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("doorList", doorList);
		return "emp_update";
	}
	@RequestMapping("/empUpdate")
	public String empUpdate(Emp emp) {
		empService.empUpdate(emp);
		return "forward:/empList";
	}
}
