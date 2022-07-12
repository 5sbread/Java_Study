package com.bh.array;

public class Array_7 {
//알고리즘 선택정렬
	
	public static void main(String[] args) {
		int [] ar = {5, 6, 3, 8, 1};
		
		//내림차순 8 6 5 3 1
		//왼쪽에서부터 2개씩 비교
		//왼쪽>오른쪽 이면 그대로 | 왼쪽<오른쪽이면 서로 자리 바꾸기
		
		for(int i=0; i<ar.length-1; i++) {
			//i=0; 1234
			for(int j=i; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int tmp = ar[j]; //임시값에 j값 넣어두기
					ar[j]=ar[i];
					ar[i]=tmp;
				}
			}System.out.println(ar[i]);
		}
		
	}

}
