package com.bh.control;

import java.util.Scanner;

public class Control1 {
	public static void main(String [] args) {
		//제어문
		//1. 단일 if문
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		//num을 2로 나누었을 때 나머지가 0과 같다면(=짝수) 출력
		if(num%2==0) { //중괄호{}생략가능
			System.out.println(num+ " 은(는) 짝수 입니다.");
			///System.out.println(num+ " 은(는) 짝수 입니다.);
		}
		if(num<0) {
			System.out.println(num+ "은(는) 여전히 10미만");
			
		}
		
		
		System.out.println("Finish");
	}
}
