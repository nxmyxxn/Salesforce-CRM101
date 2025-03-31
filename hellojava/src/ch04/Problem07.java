package ch04;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		boolean play = true;
		String c = "";
		
		while( play ==true) {
			// 게임 진행 여부
			int answer = (int) (Math.random()*99);
			System.out.println(answer);
			
			while(true) {			
				System.out.println(">>");
				int input = sc.nextInt();
				
				if(input>answer)
					System.out.println("더 낮게");
				else if(input<answer)
					System.out.println("더 높게");
				else {
					System.out.print("맞았습니다.");
					break;
				}
			}

			System.out.println("게임을 종료하시겠습니까?(y/n) >>");		
			sc.nextLine();
			c= sc.nextLine();
			
			if("y".equals(c) || "Y".equals(c) ) {
				play = false;
			}
			else if("n".equals(c)){
				play = true;
			}					
		}	
		System.out.println("=========================");
		System.out.println("     [숫자맞추기게임 종료]     ");
		System.out.println("=========================");	
	}

}
