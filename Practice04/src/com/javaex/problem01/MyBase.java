package com.javaex.problem01;

public class MyBase extends Base{

    //코드작성
	//오버라이딩
	public void service(String state) {

        if (state.equals("낮")) {
            day();
        } else if(state.equals("오후")){
        	afternoon();
        }
        else {
        	night();
        }
            
    }
	//추가 (오버라이딩 아님)
	public void afternoon() {
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }
	
	//오버라이딩
	public void day() {
        System.out.println("낮에는 열심히 일하자");
    }

    
}
