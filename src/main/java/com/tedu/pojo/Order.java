package com.tedu.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Order {

	private Integer id;	//订单id
	private Integer doorId;	//门店编号
	private String orderNo;	//订单编号
	private String orderType;	//订单类型
	private Integer pnum;	//用餐人数
	private String cashier;	//收银员
	private Date orderTime;	//下单时间
	private Date payTime;	//结账时间
	private String payType;	//支付方式
	private double price;	//支付金额
}
