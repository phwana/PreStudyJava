package com.kh.java.basic.operator;

public class Exam_triple {
	public static void main(String [] args) {
		
		// %2 == 0 - true  -> 짝수입니다
		//         - false -> 홀수입니다
		// 비교연산자의 결과값(true,false)를 사용해야 함
		
		// 분기처리 -> 삼항연산자 : 항1 ? 항2 : 항3
		// 항1 : 비교연산t/f
		// 항2 : true의 리터럴
		// 항3 : false의 리터럴
		
		// String result = (num1 > num2) ? "참" : "거짓"
		
		/* 짝홀판별
		 * 항1: num%2 == 0, num%2 != 0
		 * 항2: "짝수"      "홀수"
		 * 항3: "홀수"      "짝수"
		 */
		int num1 = 3;
		int num2 = 0;
		String result = (num1 > num2) ? "참" : "거짓";
			
		int num = 2;
		result = (num%2 == 0) ? "짝수" : "홀수";
		
		/* 장점 - 제어문, 조건문을 간단하게 쓸 수 있음
		 * 간결해지며 가독성 해치지 않는 경우에만 사용 권장
		 */
	}

}
