package com.tedu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.pojo.Door;

public interface DoorService {

	List<Door> doorFindAll();

	void doorInsert(Door door);

	void doorDelete(Integer id);

	Door doorFindById(Integer id);

	void doorUpdate(Door door);
	

}
