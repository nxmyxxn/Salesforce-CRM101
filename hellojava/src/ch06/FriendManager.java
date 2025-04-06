package ch06;

import java.util.Scanner;

public class FriendManager {

    static Friend[] friends = new Friend[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){


        while(true){
            System.out.println("--------------------------");
            System.out.println(" 1.추가 2.목록 3.수정 4.종료 ");
            System.out.println("--------------------------");
            System.out.print("선택>");

            int num = Integer.parseInt(sc.nextLine());
            if(num==1)
                addFriends();
            else if(num==2)
                showList();
            else if(num==3)
                editInfo();
            else{
                System.out.print("프로그램 종료");
                break;
            }
        }
    }

    public static void addFriends(){
        String name;
        String number;
        String email;

        System.out.print("이름: ");
        name = sc.nextLine();
        System.out.print("전화번호: ");
        number = sc.nextLine();
        System.out.print("이메일: ");
        email = sc.nextLine();

        Friend friend = new Friend(name, number, email);
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null) {
                friends[i] = friend;
                System.out.println("추가되었습니다.");
                break;
            }
        }
    }

    public static void showList(){
        for(Friend f : friends){
            if(f != null) {
                System.out.println("이름: " + f.getName() +" 전화번호: " + f.getNumber() + " 이메일: " + f.getEmail());
            }
        }
    }

    public static void editInfo(){
        String name;
        String number;
        String email;

        System.out.print("이름: ");
        name = sc.nextLine();
        for(Friend f : friends){
            if(f!=null && name.equals(f.getName())){
                System.out.print("전화번호: ");
                number= sc.nextLine();
                f.setNumber(number);

                System.out.print("이메일: ");
                email = sc.nextLine();
                f.setEmail(email);

                break;
            }
        }
        System.out.println("\""+name+"\""+" 이란이름의 친구는 없습니다.");
    }


}
