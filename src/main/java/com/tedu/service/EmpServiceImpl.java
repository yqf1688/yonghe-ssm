package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.EmpMapper;
import com.tedu.pojo.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Emp> empFindAll() {
		return empMapper.empFindAll();
	}
	@Override
	public void empInsert(Emp emp) {
		empMapper.empInsert(emp);
	}
	@Override
	public void empDeleteById(Integer id) {
		empMapper.empDeleteById(id);
	}
	@Override
	public Emp empFindById(Integer id) {
		return empMapper.empFindById(id);
	}
	@Override
	public void empUpdate(Emp emp) {
		empMapper.empUpdate(emp);
	}

}
