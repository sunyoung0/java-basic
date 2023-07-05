package com.sun.demo.controller;

import com.sun.demo.service.MainService;

// com.sun.demo.controller 프로젝트의 입력 및 출력과 관련된 기능을 담당하는 클래스 
public class MainController {
	
	private MainService mainService;
	
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}
	
	public void printDatas() {
		mainService.printDatas();
	}
}
