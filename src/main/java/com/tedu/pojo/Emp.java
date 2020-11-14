package com.tedu.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Emp {
	private Integer id;	//员工编号
	private String name;	//门店名称
	private String job;	//门店电话
	private Date hireDate;//门店地址
	private Integer doorId;
	private Double salary;
}
