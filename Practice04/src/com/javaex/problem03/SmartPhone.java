package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
      
            if("앱".equals(str)){
                runApp();
            }else{
                super.execute(str);
            }
            
    }
 
    
    //오버라이드 아님 자식클래스의 새로운 메서드
    //메소드작성
    public void runApp() {
    	System.out.println("앱실행");
    }
    
    //오버라이딩
    //메소드작성
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
