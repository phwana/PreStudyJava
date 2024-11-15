package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic2 {
	public static void main(String [] args) {
		/*
		 * 입력받은 문자가 대문자인지 소문자인지 확인하는 프로그램
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요.: ");
		char one = sc.next().charAt(0);
		
		boolean result = (one >= 'A') && (one <= 'Z');
		System.out.print("영어 대문자 확인 : "+result);
		
	}

}
