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
		
		
		int result = ch+num;
		
		//소문자가 범위를 벗어났을 때 (아스키 코드)
		if(result>'z') {
			result = reslut - 'z' -1;
			result = 'a' + result
		}
		
		//대문자가 범위를 벗어났을 때 
		if(result>'Z' && result<'a') {
			result = result - 'Z' -1;
			result = 'A' + result;
		}
		
		
		ch = (char)result;
		System.out.println("ch : " +ch);
		
		//깃허브 파일 수정 방법 공부중
		//학원오면 fork에서 pull 먼저 하기
		

	}

}
