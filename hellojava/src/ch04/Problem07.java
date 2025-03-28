package ch04;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		
		int answer = (int) (Math.random()*99);
		String c = "";
		
		while(true) {
			System.out.println(">>");
			int input = sc.nextInt();
			if(input>answer)
				System.out.println("더 낮게");
			else if(input<answer)
				System.out.println("더 높게");
			else {
				System.out.print("맞았습니다.\n"+"게임을 종료하시겠습니까?(y/n) >>");
				sc.nextLine();
				c= sc.nextLine();
				if(c.equals("y")) {
					System.out.println("=========================");
					System.out.println("     [숫자맞추기게임 종료]     ");
					System.out.println("=========================");	
					break;
				}
				else if(c.equals("n")){
					continue;
				}
				
			}
				
			
		}
		
	}

}
