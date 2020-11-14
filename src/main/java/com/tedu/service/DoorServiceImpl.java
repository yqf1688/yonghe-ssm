package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
@Service
public class DoorServiceImpl implements DoorService{
	
	@Autowired
	private DoorMapper doorMapper;

	@Override
	public List<Door> doorFindAll() {
		List<Door> doorList = doorMapper.doorFindAll();
		return doorList;
	}

	@Override
	public void doorInsert(Door door) {
		doorMapper.doorInsert(door);
	}

	@Override
	public void doorDelete(Integer id) {
		doorMapper.doorDelete(id);
	}

	@Override
	public Door doorFindById(Integer id) {
		Door door = doorMapper.doorFindById(id);
		return door;
	}
	@Override
	public void doorUpdate(Door door) {
		doorMapper.doorUpdate(door);
	}
	

	
	

}
