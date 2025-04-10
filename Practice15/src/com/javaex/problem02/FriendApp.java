package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {
	
	

	public static void main(String[] args) {
		ArrayList<Friend> fList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 3명 입력:");

		
		for(int i=0; i<3; i++) {
			
			String input = sc.nextLine();
			String[] f = input.split(" ");
			String a=f[0];
			String b=f[1];
			String c=f[2];
			
			fList.add(new Friend(a, b, c));
		}
		
		System.out.println(fList);

	}

}
