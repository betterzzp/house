package cn.zhouzhongping.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zhouzhongping.house.service.HouseSpiderService;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@Autowired
	private HouseSpiderService houseSpiderService;
	@RequestMapping("/world")
	public String getHelloWorld() {
		houseSpiderService.spiderAnjuke();
		return "Hello World";
	}
}
