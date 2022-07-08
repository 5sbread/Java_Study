package com.bh.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//ID 입력, PW 입력
		//로그인 판단 - 로그인이 성공하면 종료
		//실패하면 다시 입력 (횟수 제한 X)
		
		boolean check = true;
		boolean flag = false; //로그인 여부 확인용
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			
			switch(select){
			case 1:
				System.out.println("Id를 입력하세요.");
				int id = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int pw = sc.nextInt();
				
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					check =! check; //false
					flag =! flag;
				}else {
					System.out.println("로그인 실패");
				}
			break;
			default :
				check=!check; //false
			} //switch 끝
		}	//while 끝
		
// =================================
//로그인을 안했으면 프로그램 종료
//로그인 시 게임 시작
//RPG
//시작 레벨 1
//만렙 15
//보유 골드 1000
//레벨 5 달성시 축하금 1000 골드 지급
//레벨 10 달성시 축하금 2000
//레벨 15달성시 축하금 골드 3000
		
		flag = true; //개발 때 쉽게 로그인하기 위해 true 값 주고 테스트 하기
		if(flag) { //flag true면 로그인 성공, false면 로그인 실패
			System.out.println("게임을 시작합니다.");

			int lev = 1;
			int gold = 1000;
			
			for(lev=1;lev<15;lev++) {
				if(lev%5==0) {
					gold = gold + (lev/5);
				}
			}
			gold = gold+3000;
			System.out.println("최종 레벨 "+lev);
			System.out.println("최종 골드 "+gold);
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("게임을 시작합니다.");
		
		System.out.println("현재 레벨 : 1");
		System.out.println("보유 골드 : 1000");
		System.out.println("--------------");
		
//		for(int l=lev;l<=30;l++) {
//			System.out.println("사냥?");
//			System.out.println("1. YES | 2. NO");
//			int y = sc.nextInt();
//			if(y==1) {
//				
				
		}


	}


