package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tedu.pojo.Door;

public interface DoorMapper {
	
	@Select("select * from tb_door")
	List<Door> doorFindAll();

	@Insert("insert into tb_door value(null,#{name},#{tel},#{addr})")
	void doorInsert(Door door);

	@Delete("delete from tb_door where id=#{id}")
	void doorDelete(Integer id);

	@Select("select * from tb_door where id=#{id}")
	Door doorFindById(Integer id);

	@Update("update tb_door set name=#{name},tel=#{tel},addr=#{addr} where id=#{id}")
	void doorUpdate(Door door);

}
