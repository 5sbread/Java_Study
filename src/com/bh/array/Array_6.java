package com.bh.array;

public class Array_6 {

	public static void main(String[] args) {
		//배열의 길이 변경
		
		int [] nums = {1, 2, 3};
		int [] copy = new int[nums.length-1]; //깊은 복사
		
		for(int i=0; i<copy.length; i++) {
			copy[i]=nums[i]; //9줄에서 -1했기때문에 0, 1 두 데이터만 저장
		}
		
		nums = copy; //길이 한칸 줄여짐
		
		System.out.println(nums.length);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}

}
