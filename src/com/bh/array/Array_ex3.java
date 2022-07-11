package com.bh.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//팝업 메서지
		//1. 학샐정보 입력
		// - 학생 수
		// - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
		//2. 정보 조회
		// - 모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 정보 검색
		// - 검색할 학생의 번호 입력
		// - 입력한 번호와 일치하는 학생의 모든 정보 출력
		// - 일치하는 번호가 없으면 없는 학생이다 출력
		//4. 정보 삭제
		// - 삭제할 학생의 번호 입력
		// - 입력한 번호와 일치하는 학생의 정보 삭제 (배열 한칸 줄이기)
		// - 없으면 없다고 출력
		//5. 정보 추가
		// - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균 추가
		//6. 프로그램 좋료
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean check = true;
		
		while(check) {
			
			String [] sName = new String [10];
			int [] sNum = new int [10];
			int [] sKor = new int [10];
			int [] sEng = new int [10];
			int [] sMath = new int [10];
			int [] sTotal = new int [10];
			int [] sAvg = new int [10];
			
			System.out.println("원하는 서비스의 번호를 입력하세요.");
			System.out.println("1.학생정보 입력 | 2.학생정보 조회 | 3.학생정보 검색");
			System.out.println("4.학생정보 삭제 | 5.학생정보 추가 | 6.프로그램 종료");
			int in = sc.nextInt();
			System.out.println(in+"번을 선택했습니다.");
			System.out.println();
			
				if(in==1) {
					System.out.println("학생의 번호를 입력하세요.");
					int innum = sc.nextInt();
					sNum[innum]=innum;
					System.out.println("학생의 이름을 입력하세요.");
					String inname = sc.next();
					sName[innum]=inname;
					System.out.println("학생의 국어 점수를 입력하세요.");
					int inkor = sc.nextInt();
					sKor[innum]=inkor;
					System.out.println("학생의 영어 점수를 입력하세요.");
					int ineng = sc.nextInt();
					sEng[innum]=ineng;
					System.out.println("학생의 수학 점수를 입력하세요.");
					int inmath = sc.nextInt();
					sMath[innum]=inmath;
					
					sTotal[innum] = inkor+ineng+inmath;
					sAvg[innum]=sTotal[innum]/3;
					
					System.out.println("저장되었습니다.");
					System.out.println("이름 : "+sName[innum]+" | 번호 : "+sNum[innum]);
					System.out.println("국어 : "+sKor[innum]+" | 영어 : "+sEng[innum]+" | 수학 : "+sMath[innum]);
					System.out.println("총합 : "+sTotal[innum]+" | 평균 : "+sAvg[innum]);
					
				}else if(in==2) {
					System.out.println("모든 학생의 정보를 출력합니다.");
					
					
					
					
				}else if(in==3) {
					System.out.println("검색할 학생의 번호를 입력하세요.");
					int innum = sc.nextInt();
					if(innum==){//해당 번호가 있으면 정보 출력
						System.out.println();
					}else {
						System.out.println("잘못된 입력입니다.");
					}
					
					
				}else if(in==4) {
					System.out.println("삭제할 학생의 번호를 입력하세요.");
					int innum = sc.nextInt();
					
					
					
					
				}else if(in==5) {
					System.out.println("추가할 학생의 번호를 입력하세요.");
					int innmum = sc.nextInt();
					
					
					
					
				}else if(in==6) {
					System.out.println("프로그램을 종료합니다.");
					check =! check;
				}else {
					System.out.println("잘못된 선택입니다.");
				}//else
		}//while
		
		
	}

}
