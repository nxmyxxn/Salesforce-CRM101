package ch04;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int balance=0;
		int deposit=0;
		int withdraw=0;
		
		while(true) {	
			
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				System.out.print("예금액> ");
				deposit += sc.nextInt();
				sc.nextLine();
				balance += deposit;
			}
				
			else if(input.equals("2")) {
				System.out.print("출금액> ");
				withdraw += sc.nextInt();
				sc.nextLine();
				balance -= withdraw;
			}
				
			else if(input.equals("3")) {
				System.out.print("잔고> " + balance);
				System.out.println();
			}
				
			
			else if (input.equals("4")) {
	            System.out.print("프로그램 종료");
	            break;     
	        } 

		}

	}

}
