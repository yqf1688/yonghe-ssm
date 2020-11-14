package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.DoorService;
import com.tedu.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private DoorService doorService;
	
	@RequestMapping("/orderList")
	public String OrderFindAll(Model model) {
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("doorList", doorList);
		List<Order> orderList = orderService.orderFindAll();
		model.addAttribute("orderList", orderList);
		return "order_list";
	}
	//http://localhost:8080/yonghe/toOrderAdd
	@RequestMapping("/toOrderAdd")
	public String Doorfind(Model model) {
		List<Door> doorList = doorService.doorFindAll();
		model.addAttribute("list", doorList);
		return "order_add";
	}
	//http://localhost:8080/yonghe/orderAdd
	@RequestMapping("/orderAdd")
	public String OrderInsert(Order order) {
		orderService.orderInsert(order);
		return "forward:/orderList";
	}
	//http://localhost:8080/yonghe/orderDelete?id=5
	@RequestMapping("/orderDelete")
	public String orderDelete(Integer id) {
		orderService.orderDeleteById(id);
		return "forward:orderList";
	}
	@RequestMapping("/orderInfo")
	public String orderFindById(Integer id,Model model) {
		List<Door> doorList= doorService.doorFindAll();
		model.addAttribute("doorList", doorList);
		Order order = orderService.orderFindById(id);
		model.addAttribute("order", order);
		return "order_update";
	}
	@RequestMapping("/orderUpdate")
	public String orderUpdate(Order order) {
		orderService.orderUpdate(order);
		return "forward:/orderList";
		
	}
}
