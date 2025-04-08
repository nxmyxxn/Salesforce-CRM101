package com.javaex.problem04;

//추상 클래스, 객체 생성 직접 안됨, 이를 구현하는 자식클래스가 생성해야 함, 레퍼런스 변수에 담기는 가능
public abstract class Bird {
    private String name;
    
    protected String getName(){
        return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public abstract void sing();
    public abstract void fly();
    public abstract void showName();

}
