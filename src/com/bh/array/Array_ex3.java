package com.bh.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//팝업 메서지
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		String [] names = null; //학생 이름 배열
		int [] nums = null; //지역 변수
		int []kors = null; //나중에 값을 넣기 위해 null
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		double [] avgs = null;
		
		while(check) {
			
			System.out.println("원하는 서비스의 번호를 입력하세요.");
			System.out.println("1.학생정보 입력 | 2.학생정보 조회 | 3.학생정보 검색");
			System.out.println("4.학생정보 삭제 | 5.학생정보 추가 | 6.프로그램 종료");
			int select = sc.nextInt();
			System.out.println(select+"번을 선택했습니다.");
			System.out.println();
			
				if(select==1) {
					//1. 학샐정보 입력
					// - 학생 수
					// - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
					System.out.println("학생 수를 입력하세요.");
					int s = sc.nextInt();
					names = new String [select];
					nums = new int[names.length];
					kors = new int[names.length];
					engs = new int[names.length];
					maths = new int[names.length];
					totals = new int[names.length];
					avgs = new double[names.length];
					
					for(int i=0; i<names.length; i++) {
						System.out.println(i+1+"번째 학생의 이름을 입력하세요.");
						names[i] = sc.next();
						System.out.println(i+1+"번째 학생의 번호를 입력하세요.");
						nums[i] = sc.nextInt();
						System.out.println(i+1+"번째 학생의 국어 점수를 입력하세요.");
						kors[i] = sc.nextInt();
						System.out.println(i+1+"번째 학생의 영어 점수를 입력하세요.");
						engs[i] = sc.nextInt();
						System.out.println(i+1+"번째 학생의 수학 점수를 입력하세요.");
						maths[i] = sc.nextInt();
					
						totals[i] = kors[i]+engs[i]+maths[i];
						avgs[i]=totals[i]/3.0;

						System.out.println("저장되었습니다.");
						System.out.println("이름 : "+names[i]+" | 번호 : "+nums[i]);
						System.out.println("국어 : "+kors[i]+" | 영어 : "+engs[i]+" | 수학 : "+maths[i]);
						System.out.println("총합 : "+totals[i]+" | 평균 : "+avgs[i]);
					} //for 끝	
					
					
				}else if(select==2) {
					//2. 정보 조회
					// - 모든 학생의 이름, 번호, 총점, 평균 출력
					if(names != null);{
						System.out.println("모든 학생의 정보를 출력합니다.");
						System.out.println("이름\t번호\t총점\t평균");
						for(int i=0; i<names.length; i++) {
							System.out.println(names[i]+"\t"+nums[i]+"\t"+totals[i]+"\t"+avgs[i]);
						}//for
					}else {
						System.out.println("학생정보가 없습니다.");
					}//else 학생정보 입력
					
				}else if(select==3) {
					//3. 정보 검색
					// - 검색할 학생의 번호 입력
					// - 입력한 번호와 일치하는 학생의 모든 정보 출력
					// - 일치하는 번호가 없으면 없는 학생이다 출력
					System.out.println("검색할 학생의 번호를 입력하세요.");
					select = sc.nextInt();
					boolean flag = false; //
					
					for(int i=0; i<names.length; i++) {
						if(select == nus[i]) {
							System.out.println("이름\t번호\t총점\t평균");
							System.out.println(names[i]+"\t"+nums[i]+"\t"+totals[i]+"\t"+avg[i]);
							flag =! flag;
							break;
						}	
					}//for

					if(flag) {
						System.out.println("일치하는 학생정보가 없습니다.");
					}
					System.out.println("검색 출력이 종료되었습니다.");
					
				}else if(select==4) {
					//4. 정보 삭제
					// - 삭제할 학생의 번호 입력
					// - 입력한 번호와 일치하는 학생의 정보 삭제 (배열 한칸 줄이기)
					// - 없으면 없다고 출력
					System.out.println("삭제할 학생의 번호를 입력하세요.");
					select = sc.nextInt();
					boolean flag = flase;
					
					String [] namesCopy = null;
					int [] numsCopy = null;
					int [] korsCopy = null;
					int [] engsCopy =null;
					int [] mathsCopy = null;
					int [] totalsCopy = null;
					double [] avgCopy = null;
					
					int i = 0;
					for(i=0; i<names.length; i++) {
						if(select == nums[i]) {
							flag=!flag;
							break;
						}//if	
					}
					if(flag) {
						namesCopy = new String [names.length-1];
						numsCopy = new int[namesCopy.length];
						korsCopy = new int[namesCopy.length];
						engsCopy = new int[namesCopy.length];
						mathsCopy = new int[namesCopy.length];
						totalsCopy = new int[namesCopy.length];
						avgsCopy = new double[namesCopy.length];
						int index=0;
						for(int j=0;j<names.length;j++) {
							if(j==i) {
								//index--;
								continue;
							}//if
							namesCopy[index] = names[j];
							numsCopy[index] = nums[j];
							korsCopy[index] = kors[j];
							engsCopy[index] = engs[j];
							mathsCopy[index] = maths[j];
							totalsCopy[index] = totals[j];
							avgsCopy[index] = avgs[j];
							index++;	
						}//135 for 왜 이렇게 쓰는지?
						
						names = namesCopy;
						nums = numsCopy;
						kors = korsCopy;
						engs = engsCopy;
						maths = mathsCopy;
						totals = totalsCopy;
						avgs = avgsCopy;
					}else {
						System.out.println("일치하는 학생 정보가 없습니다.");
					} //126 if
					System.out.println("학생을 삭제했습니다.");
					
					
				}else if(select==5) {
					//5. 정보 추가
					// - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균 추가
					
					String [] namesCopy = new String [names.length+1]; //한칸 추가해서 새 배열 만들기
					int [] numsCopy = new int [namesCopy.length]; //한칸 늘어난 namesCopy를 기준으로
					int [] korsCopy = new int [namesCopy.length];
					int [] engsCopy = new int [namesCopy.length];
					int [] mathsCopy = new int [namesCopy.length];
					int [] totalsCopy = new int [namesCopy.length];
					double [] avgsCopy = new double [namesCopy.length];
					
					for(int i=0; i<names.length; i++);
						namesCopy[i]=names[i]; //새로 만든 배열에 기존 데이터 복사
						numsCopy[i]=nums[i];
						korsCopy[i]=kors[i];
						engsCopy[i]=engs[i];
						mathsCopy[i]=maths[i];
						totalsCopy[i]=totals[i];
						avgsCopy[i]=avgs[i];
					}//for
					
					System.out.println("추가할 학생의 이름을 입력하세요.");
					namesCopy[names.length] = sc.nextInt();
					System.out.println("추가할 학생의 번호를 입력하세요.");
					numsCopy[names.length]=sc.nextInt();
					System.out.println("추가할 학생의 국어 점수를 입력하세요.");
					korsCopy[names.length]=sc.nextInt();
					System.out.println("추가할 학생의 영어 점수를 입력하세요.");
					engsCopy[names.length]=sc.nextInt();
					System.out.println("추가할 학생의 수학 점수를 입력하세요.");
					mathsCopy[names.length]=sc.nextInt();
					
					totalsCopy[names.length]=korsCopy[names.length]+engsCopy[names.length]+mathsCopy[names.length];
					avgsCopy[names.length]=totalsCopy[names.length]/3.0;
					
					names = namesCopy; //원래 배열에 새로운 데이터 넣기
					nums=numsCopy;
					kors=korsCopy;
					engs=engsCopy;
					maths=mathsCopy;
					totals=totalsCopy;
					avgs=avgsCopy;
					System.out.println("학생이 추가되었습니다.");

					
				}else if(in==6) {
					//6. 프로그램 좋료
					System.out.println("프로그램을 종료합니다.");
					check =! check;
				}else {
					System.out.println("잘못된 선택입니다.");
				}//else
		}//while
		
		
	}

}
