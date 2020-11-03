package com.liang.mcl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")

public class mcl {
	@RequestMapping("mcl")
	public String mcl(){
		return "mcl";
	}

}
