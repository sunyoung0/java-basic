package com.sun.demo;

import java.util.Scanner;

import com.sun.demo.controller.MainController;
import com.sun.demo.service.MainService;
import com.sun.demo.repository.ObjectRepository;
import com.sun.demo.repository.Object2Repository;

// com.sun.demo 프로젝트의 실제 실행 클래스
public class MainApplication {

	private static MainController mainController;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		ObjectRepository objectRepository = new ObjectRepository(input);
		Object2Repository object2Repository = new Object2Repository();
		MainService mainService = new MainService(objectRepository);
		
		if(input <= 0) mainService = new MainService(object2Repository);
		else mainService = new MainService(objectRepository);
	
		mainController = new MainController(mainService);
		mainController.printDatas();
	
	}

}
