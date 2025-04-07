package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] arr){
       String temp = "";
//       for(int i=0;i<arr.length; i++) {
//    	   temp+=arr[i];
//       }
       
       for (String str : arr) {
    	    temp += str;
    	}
       
       return temp;
       
        
    }

}
