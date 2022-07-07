package com.bh.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		//실제 받는 금액 출력
		
		Scanner sc = new Scanner(System.in);
		
		double mon =0.0;
		int num = 0;
		double result = 0.0;
		
		System.out.println("월급을 입력하세요.");
		mon = sc.nextDouble();
		
		System.out.println("정규직이면 1을, 계약직이면 2를 입력하세요.");
		num = sc.nextInt();
		if(num==1) {
			double tax1 = (double)(mon*0.01);
			double tax2 = (double)(mon*0.014);
			double tax3 = (double)(mon*0.005);
			double tax4 = (double)(mon*0.007);
			
			result = mon - tax1 - tax2 - tax3 - tax4;
			System.out.println("실수령금액은 " + result + "원 입니다.");
			
		}else if(num==2) {
		double result2 = (double)(mon*0.033);	
		}
		
		

	}

}
