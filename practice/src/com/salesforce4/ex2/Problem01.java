package com.salesforce4.ex2;

public class Problem01 {

	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int count =0;
		int sum =0;
		
		for(int arr : data) {
			if(arr%3==0) {
				count++;
				sum+=arr;
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);


	}

}
