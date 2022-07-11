package com.bh.array;

public class Array_3 {

	public static void main(String[] args) {
		
		int [] nums = new int [3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int [] nums2 = nums; //얕은 복사
		System.out.println(nums2[2]);
		
		nums[0] = 99;
		System.out.println(nums[0]); //nums[0]이 99이기 때문
		
		int a =8;
		int b = a;
		b = 4;
		
		System.out.println(a);
		
		
		

	}

}
