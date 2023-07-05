package com.sun.demo.repository;

// com.sun.demo.repository 프로젝트에서 데이터베이스의 Object 테이블에 접근하는 클래스
public class ObjectRepository implements Repository {

	private int[] datas;
	
	public ObjectRepository(int data) {
		this.datas = new int[] {data, data*2, data*3};
	}
	
	public int[] getDatas() {
		return this.datas;
	}
}
