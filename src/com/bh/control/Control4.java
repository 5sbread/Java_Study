package com.bh.control;

public class Control4 {
	public static void main(String[] args) {
		
		//다중 IF문 대신 사용 가능한것
		//switch case
		int select = 1;
		switch(select) {
		case 1:
			System.out.println("1일 때 코드 진행");
			break;
		case 2:
			System.out.println("2일 때 코드 진행");
			break;
		default: //case1, 2도 아닌 나머지
			System.out.println("그외 나머지 진행");
			//break 써도 되고 안써도 됨
		}
		
		String selec = "";
		switch(selec){
		case "aaa":
			System.out.println("2일때 진행");
			break;
		default:
			System.out.println("그 외 진행");
		case "abc":
			System.out.println("1일 때 진행");
		}
		
	}
}
