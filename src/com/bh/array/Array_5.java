package com.bh.array;

public class Array_5 {

	public static void main(String[] args) {
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		
		//얕은 복사 : 주소만 복사 / 한쪽의 데이터가 변하면 둘다 변함
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		//깊은 복사 : 새로운 배열을 만들고 값을 복사 / 서로 독립적인 데이터
		int [] nums3 = new int[3]; //new : heap 영역에 새로 만드는 것
		for(int i=0; i<nums1.length; i++) {
			nums3[i]=nums1[i];
		}
		
		nums2[0]=9;
		System.out.println(nums1[0]);
		
		nums3 = new int[3];
		System.out.println(nums3[0]);
		
		
		
	}

}
