package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Order;

public interface OrderMapper {

	List<Order> orderFindAll();

	void orderInsert(Order order);

	void orderDeleteById(Integer id);

	Order orderFindById(Integer id);

	void orderUpdate(Order order);

}
