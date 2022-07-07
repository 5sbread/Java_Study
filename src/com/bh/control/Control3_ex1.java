package com.bh.control;

import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) { //메소드
		//국어, 영어, 수학 계산
		//총점 평균 계산
		// 평균 90점 이상은 A
		//80점 이상 B
		//70 C
		//평균 60D
		//그 외 F
		
		int num = 1; //메소드 안에서 선언된 변수 = 지역변수
		//인스턴스 변수? 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		double kor = sc.nextDouble();
		System.out.println("수학 점수를 입력하세요.");
		double math = sc.nextDouble();
		System.out.println("영어 점수를 입력하세요.");
		double eng = sc.nextDouble();
		
		double avg = (kor+math+eng)/3;
		
		if(avg>=90) {
			System.out.println("학점 A");
		}else if(avg>=80){
			System.out.println("학점 B");
		}else if(avg>=70) {
			System.out.println("학점 C");
		}else if(avg>=60) {
			System.out.println("학점 D");
		}else {
			System.out.println("분발하세요. F");
		}
		//지역 변수 {} 괄호 안에서 생성된	
		
	}
}
