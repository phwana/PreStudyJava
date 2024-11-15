package com.kh.java.basic.operator;

public class Exam_comparison {
	public static void main(String [] args) {
		// 산술연산자: +, -, x, /, %
		// 비교연산자: <, >, <=, >=, ==(같은지?), !=(다르니?)
		int num1 = 1;
		int num2 = 3;
		// 두 수의 비교
		boolean result = num1 < num2;
		System.out.println(result);
		// boolean result2 = num1 > num2;
		result = num1 > num2;
		System.out.println(result);
		//result = 0 < num1 < 10;
		// 0과 10사이의 수인가?
		// num1이 0보다 크고/ num1이 10보다 작아야 함
		// 참                 참
		// 둘다 참일 때 참이어야 함. -> 논리연산자
	    result = 0<num1 && num1<10;
		System.out.println("0<num1 && num1<10 :" + result);
		result = (num1 == 1);
		System.out.println("num1 == 1 :"+result);
		result = (num1 == 2);
		System.out.println("num1 == 2 :"+result);
		result = (num1 !=10);
		System.out.println("num1 != 10:"+result);
		result = (num1 !=1);
		System.out.println("num1 != 1:"+result);
		// ! 달라야 true
		
		
	}
}
