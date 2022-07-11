package com.bh.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		//몬스터 기본정보
		String [] monsterNames = {"좀비", "스켈레톤", "크리퍼", "팬텀"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 (마법사)
		System.out.println("캐릭터의 이름을 입력하세요.");
		String name = sc.next();
		System.out.println();
		
		//파이어볼
		int magicPower = 6;
		
		
		//몬스터 파티 생성
		//몬스터의 수 입력 (최소 1 - 최대 4)
		//입력한 수만큼 몬스터를 랜덤하게 뽑고 해당 몬스터의 hp를 뽑아서 출력
		System.out.println("몬스터 수를 입력하세요.");
		System.out.println("최소 1 - 최대 4");
		int count = sc.nextInt();
		String [] monsterPartyNames = new String[count]; //몬스터수를 담을 배열
		int [] monsterPartyHps = new int[count];
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
			
		}
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			System.out.print(monsterPartyNames[i]+" | ");
			System.out.println(monsterPartyHps[i]);
		}
		
		
		//1회성
		//0-6미만의 랜덤한 데미지로 몬스터를 공격
		boolean check = true;
		
		
		while(check) {
			int death = 0;
			System.out.println("================");
			System.out.println("몬스터가 나타났습니다.");
			System.out.println("공격 : 1 | 도망 : 2");
			int g = sc.nextInt();
			if(g==1) { //switch case도 가능
				for(int i=0;i<monsterPartyNames.length;i++) {
					int damage = random.nextInt(magicPower);
					if(damage==0) {
						monsterPartyHps[i] = monsterPartyHps[i] - damage ;
						System.out.println("================");
						System.out.println(name+" 님이 몬스터를 공격합니다.");
						System.out.println("사용 스킬 : 파이어볼");
						System.out.println("🦑=--");
						System.out.println("================");
						System.out.println(monsterPartyNames[i]+" 공격에 실패했습니다.");
						System.out.println("데미지 - "+damage+" | 남은 hp : "+monsterPartyHps[i] );
					}else {
						monsterPartyHps[i] = monsterPartyHps[i] - damage ;
						System.out.println("================");
						System.out.println(name+" 님이 몬스터를 공격합니다.");
						System.out.println("사용 스킬 : 파이어볼");
						System.out.println("🦑=-🔥🔥🔥🔥🔥");
						System.out.println("================");
						System.out.println(monsterPartyNames[i]+" 공격에 성공했습니다.");
						System.out.println("데미지 - "+damage+" | 남은 hp : "+monsterPartyHps[i] );
					}	//남은 hp가 마이너스가 됨 / 0이면 공격안하게 하는 법
					
					
					if(monsterPartyHps[i]<1) { //몬스터의 hp가 0이하이면 데스 카운트 1
						System.out.println(name+" 님이 "+monsterNames[i]+" 을 처치했습니다.");
						System.out.println("================");
						death++;
					}
				
				}
			}else {
				System.out.println("================");
				System.out.println(name+" 님이 도망갑니다.☠️💨");
				System.out.println();
				check =! check;
			}
		System.out.println("처치한 몬스터 수 : "+death); //??어디에 넣는지 확인하기
			
	}//while 끝
}}
