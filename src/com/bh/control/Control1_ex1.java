package com.bh.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보트로부터, 국어, 영어, 수학 점수를 차례로 입력
		//총점과 평균 계산
		//평균이 90점 이상이면 우둥상 수상 출력
		//모든학생들 졸업 출력
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double average = 0.0;
		
		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		
		sum = kor + eng + math;
		average = sum/3;
		
		if(average>=90) {
			System.out.println("우등생 수상");
		}
		
		System.out.println("졸업");

		
		//평균이 90점 이상이면 A점 
		//평균이 80점 이상이면 B학점
		//평균 70점 이상이면 C학점
		//평균 60점 이상 D학점
		//그 외 나머지F학점 출력
		
		if(average>=90) {
			System.out.println("A학점!");
		}
		
		/**if(average>=80) {
			if(average<90) {
				System.out.println("B학점");
			}
		}*/
		
		if(average>=80 && average<90) {
			System.out.println("B학점");
		}
		
		if(average>=70) {
			if(average<80) {
				System.out.println("C학점");
			}
		}
		
		if(average>=60) {
			if(average<70) {
				System.out.println("D학점");
			}
		}
		
		if(average<60) {
			System.out.println("F학점");
		
		}
		
	}

}

