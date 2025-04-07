package com.salesforce4.ex2;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		int money [] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		//int count [] = {10};
		Scanner sc = new Scanner(System.in);
		int change = 0;
		
		System.out.println("금액: ");
		change = sc.nextInt();
		
		for (int bill : money) {
            int count = change / bill; 
            if (count > 0) {
                System.out.println(bill + "원: " + count + "개");
                change %= bill; 
		
		
            }
}
}
}
