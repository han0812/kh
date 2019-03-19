package com.kh.first;

public class A_MethodPrinter {
	
	//주석 : comment, 부가 설명
	//메소드 : 기능을 수행
	
	public void methodA() {
		System.out.println("methodA() 호출됨");
		methodB();
	}
	
	public void methodB() {
		System.out.println("methodB() 호출됨");
		methodC();
	}
	
	public void methodC() {
		System.out.println("methodC() 호출됨");
	}
	

}
