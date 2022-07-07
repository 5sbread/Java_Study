package com.bh.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 1번 대문자, 2번 소문자
		//   1번이면 A-Z 출력
		//   2번이면 a-z 출력
		
		System.out.println("숫자를 입력하세요.");
		System.out.println("1 : 대문자 | 2 : 소문자");
		
		int e = sc.nextInt();
//		if 2개로 만든 식		
//		if(e==1) {
//			for(int i=65;i<=90;i++) {
//				System.out.println((char)i);
//			}
//			
//		}else if(e==2){
//			for(int i=97; i<=122; i++) {
//				System.out.println((char)i);
//			}
//		}
		
		
		//if 하나로 만든 식
		int i =97;
		int j =123;
		if(e==1){
			i=65;
			j=91;
		}
		
		for(int c=i;c<j;c++) {
			System.out.println((char)c);
		}
		
		System.out.println("==============");
		
		//2. 1-10까지의 합 구하기
		int sum = 0;
		for(int p=1; p<11; p++) {
			sum = p+sum;
		}
		System.out.println("1부터 10까지의 합은 : "+sum);
		System.out.println("==============");
		
		
		//3. ID, PW 입력해서 로그인 판단 (최대 5번)
		// 로그인 성공하면 그 즉시 종료
		
		int yId=1234; //회원가입시 입력한 ID
		int yPw=5678; //회원가입시 입력한 PW
		boolean check = false;
		int o = 0;
		
		for(o=0;o<5;o++) {
			System.out.println("ID를 입력하세요.");
			int id = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pw = sc.nextInt();
			
			if(yId == id && yPw == pw) {
				System.out.println("로그인에 성공했습니다.");
				check=!check; //불리언 체크 값(false)을 true로 변경
				o = 1000; //로그인 성공시 반복문을 빠져나가기 위해 변수를 큰 수로 지정
				}
			}
		
		//boolean 으로 로그인 체크
		if(check) {
			System.out.println("은행 업무를 시작합니다.");
		}else {
			System.out.println("은행에 방문하세요.");
		}
		
		
		//if문으로 로그인 5번 성공/실패 파악
//		if(o == 5) {
//			System.out.println("로그인에 실패했습니다.");
//			System.out.println("은행 직접 방문 바랍니다.");
//		}else {
//			System.out.println("은행 업무를 시작합니다.");
//		}
	}
}
