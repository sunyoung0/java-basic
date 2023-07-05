package com.sun.demo.service;

import com.sun.demo.repository.Object2Repository;
import com.sun.demo.repository.ObjectRepository;
import com.sun.demo.repository.Repository;

// com.sun.demo 프로젝트의 실제 비즈니스 로직을 담당하는 클래스 
public class MainService {

	private Repository repository;
//	private ObjectRepository objectRepository;
//	private Object2Repository object2Repository;
	
	
	public MainService (Repository repository) {
		this.repository = repository;
				
	}
	
	public void printDatas() {
		int[] datas = repository.getDatas();
		for (int data : datas) System.out.println(data);
	}
	
//	public void printDatas2() {
//		int[] datas = object2Repository.getDatas();
//		for (int data : datas) System.out.println(data);
//	}

}
