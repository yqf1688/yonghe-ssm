package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> orderFindAll() {
		List<Order> orderList = orderMapper.orderFindAll();
		return orderList;
	}

	@Override
	public void orderInsert(Order order) {
		orderMapper.orderInsert(order);
	}

	@Override
	public void orderDeleteById(Integer id) {
		orderMapper.orderDeleteById(id);
	}

	@Override
	public Order orderFindById(Integer id) {
		Order order = orderMapper.orderFindById(id);
		return order;
	}
	@Override
	public void orderUpdate(Order order) {
		orderMapper.orderUpdate(order);
	}
	
	

}
