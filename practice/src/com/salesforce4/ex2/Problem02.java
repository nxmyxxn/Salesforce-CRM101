package com.salesforce4.ex2;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg = 0.0;
		int[] num = new int [5]; 
		int sum = 0;
		int count = 0;
		
		System.out.println("숫자 5개 입력하3!");
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum+=num[i];
			count++;
		}
		avg = (double)sum/count;
		System.out.println("평균: " + avg);

	}

}
