package com.bh.loop;

public class Loop1 {

	public static void main(String[] args) {
		//반복문 : 코드 진행이 유일하게 위로 돌아갈 수 잇게 하는 것
		System.out.println("Start");
		
		//for(초기식;조건식;증감식){} //int타입만 올 수 있음
		for(int i=0;i<5;i=i+1) { //(i++) = (i=i+1)
			System.out.println("hello world!!");
		}
		
		System.out.println("Finish");

	}
	
	//for(int i =0; i<10;i++) {
	//}

}
