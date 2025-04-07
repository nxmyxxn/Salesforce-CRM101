package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1464.70);
        
        
        //백만원을 달러로 출력
        won=1000000;
        dollar = CConverter.toDoller(won);
        System.out.println("백만원 to dollar: "+dollar);
        
        //100달러를 원으로 출력
        dollar=100;
        won = CConverter.toKRW(dollar);
        System.out.println("$100 to won: "+ won);
        
        
    }

}
