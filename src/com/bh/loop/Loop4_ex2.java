package com.bh.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 : 
		//탄창 : 30발, 3개씩
		// 1. 단발 (한발씩)
		// 2. 점사 (3발씩)

		Scanner sc = new Scanner(System.in);

		int select=sc.nextInt();
		
		int inc = 3;
		String sound = "타타탕";
		
		if(select==1) {
			inc = 1;
			sound = "탕";
		}
		
		for(int b=0; b<30; b=b+inc){
			inc=1;
			sound = "탕";
		}
		for(int b=0;b<30;b=b+inc) {
	
		
		
//  ==============방식 2============		
//		int count = 10;
//		String sounnd ="타타탕";
//		if(select==1) {
//			count=30;
//			sound = "탕";
//		}
//		for(int b=0;b<count;b++) {
//			System.out.println();
//		}
		
		
//   =============== 방식 1==============		
//		for(int mag=0;mag<3;mag++) {
//			
//			System.out.println("1.단발 2.점사");
//			int select=sc.nextInt();
//			
//			if(select==1) {
//				for(int b=0; b<30;b++) {
//					System.out.println("탄창 : "+mag+"총알 : "+b+" 탕");
//				}	
//			}else {
//				for(int b=0; b<10;b++) {
//					System.out.println("탄창 : "+mag+"총알 : "+b+" 탕");
//			}
//			
//			}
//		}
		
		
//		============내 방식 미완================
//		int r=0;
//		for(int e=r; e<=90; e++) {
//			System.out.println("방식을 선택하세요.");
//			System.out.println("1. 단발 | 2. 점사");
//			int i = sc.nextInt();
//	
//			if(i==1) {
//				for(int w=0;w<=30;w++) {
//					System.out.println("탕");				
//				}
//			}else {
//				for(e=r; e<=90; e++) {
//					if(e%3==0) {
//					System.out.println("탕");
//					}
//				}
//			}r=e+30;
//			
//		}
//		System.out.println("종료");
		
		
		
	}
	}}


//도구 고르기 1.돌 2.철 3.다이아
//도구 별 내구도 다름
//몇번 쓸 수 있는지?