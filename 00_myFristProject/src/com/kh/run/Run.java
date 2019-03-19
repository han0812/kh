package com.kh.run;

import com.kh.first.A_MethodPrinter;

public class Run {

	public static void main(String[] args) {
		A_MethodPrinter am = new A_MethodPrinter(); //Heap에 할당
		
		am.methodA();//am 안에있는 methodA
		/*
		 * am.methodB(); am.methodC();
		 */

	}

}
