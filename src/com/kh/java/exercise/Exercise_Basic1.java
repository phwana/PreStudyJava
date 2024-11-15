package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic1 {
	public static void main(String [] args) {
		
		//입력받은 수 1~100사이의 수인지?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num <= 100);
		System.out.println("1~100사이의 수인가? : "+result);
		
	}
}
