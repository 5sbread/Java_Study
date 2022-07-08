package com.bh.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

//		nextInt(정수) : 0부터 입력한 정수 **미만** 범위에서 무작위 정수를 뽑아줌		
//		int num = random.nextInt(10); //() int 범위 내에서 랜덤한 수를 뽑아옴 | (10) :0부터 **9**사이의 숫자 중 랜덤
//		System.out.println(num);

		//EX 가위바위보 게임
		//숫자가 0이면 가위
		//     1 : 주먹
		//	   2 : 보
		
		//내가 내는 것은 프린트문으로 입력
	    //컴퓨터가 내는 것은 랜덤 출력
		//내가 이길 때까지 가위바위보 (지거나 비기면 재승부)
		
		
		boolean check = true;
		
		while(check) {
			System.out.println("0.가위 | 1.바위 | 2.보");
			int you = sc.nextInt();
			int com = random.nextInt(3);
			System.out.println("You : "+you+ " -- Com : "+com);
			
			if(com==0 && you==2) { //컴이 가위, 내가 보 - 숫자는 내가 더 크지만 가위바위보는 컴이 승
				you = -1; //내 숫자를 마이너스로 지정
			}
			
			if(com==2&&you==0) { //컴이 보, 내가 가위 - 숫자는 컴이 더 큼
				com = -1; //컴 숫자를 마이너스로 지정
			}
			
			if(com<you) {
				System.out.println("You win!");
				break;
			}else if(com==you) {
				System.out.println("Even!");
			}else if(com>you){
				System.out.println("Com Win!");
				break;	
			}
				
		}												
	}
}