package com.bh.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//숫자 입력받기
		//문자 입력
		//문자를 숫자로 형변환
		//숫자만큼 문자 암호화
		//ex. 숫자 2 | a->c | b->d
		//문자 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.println("1-5 사이의 숫자");
		int num = sc.nextInt();
		
		System.out.println("알파벳을 입력하세요.");
		char ch = sc.next().charAt(0);
		
		ch = (char)(ch+num);
		
		System.out.println("ch : " +ch);
		
		//Study Edition

	}

}
