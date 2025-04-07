package com.javaex.problem06;
import java.util.Scanner;
public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
        
        // 친구정보 입력받기
    	String input=" ";
    	for(int i=0; i<friendArray.length; i++) {
    		input = sc.nextLine();
    		
    		// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
        	String[] data = input.split(" "); 
        	
        	String name = data[0];
        	String hp = data[1];
        	String school = data[2];
        	
        
            // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
        	// 배열에 추가하기 ( friendArray <- friend객체 )
        	friendArray[i] = new Friend(name, hp, school);            
    		
    	}
            
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }
        sc.close();
    }
}
