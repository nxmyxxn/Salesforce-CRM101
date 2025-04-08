package com.javaex.problem04;

public class Sparrow extends Bird {
	
	@Override
	public void sing() {
    	System.out.println("참새"+"("+getName()+")가 소리내어 웁니다.");

	}

	@Override
	public void fly() {
    	System.out.println("참새"+"("+getName()+")가 날아 다닙니다.");

	}

	@Override
	public void showName() {
    	System.out.println("참새 이름은 "+getName()+" 입니다.");

	}



}
