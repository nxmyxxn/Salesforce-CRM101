package ch04;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		

		int sum=0;
		if(input%2==0) {
			for(int i=0;i<=input; i+=2)
				sum+=i;
		}
			
		else if(input%2!=0){
			for(int i=1;i<=input; i+=2)
				sum+=i;
		}
			
			
		System.out.println("결과값: "+ sum);
	}

}
