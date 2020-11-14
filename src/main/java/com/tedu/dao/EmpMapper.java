package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.tedu.pojo.Emp;

public interface EmpMapper {
	
	List<Emp> empFindAll();

	void empInsert(Emp emp);
	
	@Delete("delete from tb_emp where id=#{id}")
	void empDeleteById(Integer id);
	
	Emp empFindById(Integer id);

	void empUpdate(Emp emp);

}
