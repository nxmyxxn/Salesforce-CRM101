package com.javaex.problem04;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck(); //부모클래스 레퍼런스 변수 bird01에 담음
        bird01.setName("꽥꽥이"); //bird가면 상속받아 setName 사용 가능
        //나머진 내용 채워주기
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.fly();
        bird02.sing();
        bird02.showName();
    }

}
