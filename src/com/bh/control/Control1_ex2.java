package com.bh.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		//정수 입력
		//짝수면 짝수 출력, 홀수면 홀수 출력
		//단 단일 if 한번만 사용
		
		Scanner sc = new Scanner(System.in);
		
		String result = "홀수 입니다."; //변수를 홀수 출력문으로 지정
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num%2==0) { //if문이 true일 때 (짝수일 때)
			result="짝수입니다."; //변수를 짝수를 변경 후 출력
		}
		
		System.out.println(result);
		
		System.out.println("------");
		System.out.println("정수를 입력하세요");
		int number = sc.nextInt();
		String fin = "";
		fin = number%2==0 ? "짝수입니다" : "홀수입니다";
		System.out.println(fin);
		
		//깃허브 파일 수정 방법 공부중
		//학원오면 fork에서 pull 먼저 하기

		
	}

}
