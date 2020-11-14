package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Emp;

public interface EmpService {

	List<Emp> empFindAll();

	void empInsert(Emp emp);

	void empDeleteById(Integer id);

	Emp empFindById(Integer id);

	void empUpdate(Emp emp);

}
