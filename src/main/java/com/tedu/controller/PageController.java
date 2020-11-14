package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("{page}")
	public String pageIndex(
			@Validated String page) {
		return page;
	}

}
