package ch04;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		int max=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<=5; i++) {
			System.out.print("숫자:");
			int input = sc.nextInt();
			
			if (input>max)
				max=input;
		}
		
		System.out.println("최대값은" + max +"입니다.");
		

	}

}
