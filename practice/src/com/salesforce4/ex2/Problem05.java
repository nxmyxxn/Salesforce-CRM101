package com.salesforce4.ex2;

import java.util.Arrays;

public class Problem05 {

	public static void main(String[] args) {
		
		int[] array = new int[6];
		int num;
		boolean isDuplicate;
		
		
		for(int i=0; i<6; i++) {
			isDuplicate = false;
			
			do {
				num = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {
					if (array[j] == num) {
						isDuplicate = true;
						break;
					}	
				}
			}
			while(isDuplicate); //중복 아니면 나가

			array[i]=num;
			System.out.print(array[i]+" ");
			
		}
		//System.out.print(Arrays.toString(array));
		

	}
}
