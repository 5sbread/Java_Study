package com.bh.loop;

import java.util.Scanner;

public class Loop1_ex1 {
	public static void main(String[] args) {
		
	//0-9 출력하는 반목문
	//단 짝수만 출력
	
	
	for(int i = 0; i<10; i=i+1) {
		if(i%2 == 0) {
			System.out.println(i);
		}
	}
	
	System.out.println("=========");	
		
		
	//0-9 중 짝수만 출력
	//if문 사용x
	for(int i=0; i<10; i++) { //혹은 증감식 i+2도 가능
		System.out.println(i);
		i++;
	}
	
	//멍멍 출력
	//출력 횟수 입력받기
	Scanner sc = new Scanner(System.in);
	
	System.out.println("횟수를 입력하세요.");
	int i = sc.nextInt();
	for(int e=1; e<=i; e++) {
		System.out.println("멍멍");
	}
	
	
	}
}