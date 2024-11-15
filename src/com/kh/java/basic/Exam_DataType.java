package com.kh.java.basic;

public class Exam_DataType {
	public static void main(String [] args) {
		// int, String, ....
		// byte, short, int, long => 정수 패밀리
		byte bNum = 127;
		short sNum = 32767;
		int iNum =2147483647;
		long lNum = 2147483647l;
		// float, double => 실수 패밀리
		float fNum = 24.1118f;
		double dNum = 25.518;
		// char => 문자(한글자)
		char alphabet = 'A';		
		// boolean => 참거짓
		boolean yesOrNo = true; //false
		// String => 문자(여러글자)
		String message = "Hello World";
				
		System.out.println("bNum의 값 : "+bNum);
		System.out.println("sNum의 값 : "+sNum);
		System.out.println("iNum의 값 : "+iNum);
		System.out.println("lNum의 값 : "+lNum);
		System.out.println("fNum의 값 : "+fNum);
		System.out.println("dNum의 값 : "+dNum);
		System.out.println("alphabet의 값 : "+alphabet);
		System.out.println("yesOrNo의 값 : "+yesOrNo);
		System.out.println("message의 값 : "+message);
		
	}

}
