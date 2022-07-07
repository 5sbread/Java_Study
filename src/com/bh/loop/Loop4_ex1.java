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
		
		for(int m=0;m<60;m++) {
			for(int s=0;s<60;s++) {
				if(s<=d) {
					System.out.println(m + "분 : "+s+"초");
				}else
					break;
			}
		break;	
		}
		
	}

}
