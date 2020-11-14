package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

@Controller
public class DoorController {
	
	@Autowired
	private DoorService doorService;
	
	@RequestMapping("/doorList")
	public String doorfindAll(Model model) {
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("list", doorList);
		return "door_list";
	}
	//http://localhost:8080/yonghe/doorAdd
	@RequestMapping("/doorAdd")
	public String doorInsert(Door door) {
		doorService.doorInsert(door);
		return "forward:/doorList";
	}
	
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id) {
		doorService.doorDelete(id);
		return "forward:/doorList";
	}

	@RequestMapping("/doorInfo")
	public String doorFindById(Integer id,Model model) {
		Door door = doorService.doorFindById(id);
		model.addAttribute("door", door);
		return "door_update";
	}
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door) {
		doorService.doorUpdate(door);
		return "forward:/doorList";
	}
	
}
