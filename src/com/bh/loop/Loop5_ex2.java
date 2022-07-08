package com.bh.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

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
		
		
		boolean zen = true; //내가 지거나 무승부면 재승부(true) | 이기면 끝(false)
		
		
		while(zen) {
			System.out.println("하나를 입력하세요.");
			System.out.println("0:가위 | 1:주먹 | 2:보");
			int me = sc.nextInt(); //내가 내기
			int com = random.nextInt(3); //컴터 내기
			
			//---- 한글로 바꾸기 ----
			String ga = "가위";
			String ba = "바위";
			String bo = "보";

			if(com==0) {
				String c = ga;
			}else if(com==1) {
				String c = ba;
			}else {
				String c = bo;
			}
			
			//---- 승패 확인 ---- 
			if(me==0) {
				String m = ga;
				if(com==0) {
					String c = ga;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("무승부!");
				}else if(com==1) {
					String c = ba;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : COM");
				}else {
					String c = bo;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : ME");
					System.out.println();
					System.out.println("more?");
					System.out.println("1.Yes | 2.No");
					int h = sc.nextInt();
					if(h==2) {
						System.out.println("bye");
						zen =! zen;
					}else {
						System.out.println("More!");
					zen = zen;
					}
				} //내가 가위 냈을 때의 경우	
				
			}else if(me==1) {
				String m = ba;
				if(com==0) {
					String c = ga;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : Me");
					System.out.println();
					System.out.println("more?");
					System.out.println("1.Yes | 2.No");
					int h = sc.nextInt();
					if(h==2) {
						System.out.println("bye");
						zen =! zen;
					}else {
						System.out.println("More!");
					zen = zen;
					}
				}else if(com==1) {
					String c = ba;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("무승부");
				}else {
					String c = bo;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : COM");
				} //내가 바위 냈을 때의 경우
			
			}else if(me==2) {
				String m = bo;
				if(com==0) {
					String c = ga;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : COM");
				}else if(com==1) {
					String c = ba;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("Winner : Me");
					System.out.println();
					System.out.println("more?");
					System.out.println("1.Yes | 2.No");
					int h = sc.nextInt();
					if(h==2) {
						System.out.println("bye");
						zen =! zen;
					}else {
						System.out.println("More!");
					zen = zen;
					}
					
				}else {
					String c = bo;
					System.out.println();
					System.out.println("-----");
					System.out.println("Me : "+m+ " | Com : "+c);
					System.out.println("무승부");
					}
				}

			}
		
		}
	}


