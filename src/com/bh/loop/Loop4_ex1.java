package com.bh.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
	
		//분과 초를 입력 받은 후 해당 시각이 되면 종료
		//ex. 1, 15
		
		
//		for(int m=0;m<60;m++) {
//			for(int s=0;s<60;s++) {
//				System.out.println(m + "분 : "+s+"초");
//			}
//		}

		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요.");
		int n = sc.nextInt();
		System.out.println("초를 입력하세요.");
		int d = sc.nextInt();
		System.out.println();
		System.out.println(n+"분 "+d+"초");
		System.out.println();
		
		
		boolean flag = false;
		
		for(int m=0;m<60;m++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(m + "분 : "+s+"초");
				if(m==n && s==d) {
					flag = !flag;
					m=60; //if문이 true일 때 m=60 후 반복문을 빠져나옴 //코드2
					      //32라인 반복문으로 돌아간 후 증감식 사용 -> m=61 for문 종료
					break; //이중반복문의 경우 해당 반복문만 벗어남, 상위 반복문을 벗어나지 못함
				}
			}
			
//			if(flag) {   //코드 1
//				break;
			}
			
		}
		
		
		
	}


