package com.javaex.problem08;

public class Book {

	private int bookNo; 
	private String title; 
	private String author; 
	private int stateCode; 
		
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	
	
	Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode=1;
	}
	
	public void rent() {
//		if(stateCode==1) {
//			System.out.println(title+"이(가) 대여 됐습니다.");
//			stateCode=0;
//		}	
		this.stateCode=0;
		if(stateCode==0) {
			stateCode=1;
		}
		else stateCode=0;
		}
//	public void returnBook() {
//		if(stateCode==0) {
//			System.out.println(title+"이(가) 반납 됐습니다.");
//			stateCode=1;
//		}	
//	}
	
	public void print() {
//		String s = "";
//		if (stateCode==1) s = "재고있음";
//		else s = "대여중";
//		System.out.println(bookNo+"책 제목: "+title+ " 저자:"+author + " 대여유무:"+s);
		System.out.println(this.toString());
	}
	
	public String toString() {
		String temp = (this.stateCode==0) ? "대여중" : "재고있음";
		return bookNo+"책 제목: "+title+ " 저자:"+author + " 대여유무:"+temp;
	}
	
//	public void showInfo(){
//		String s = "";
//		if (stateCode==1) s = "재고있음";
//		else s = "대여중";
//        System.out.println(bookNo+" 책제목:" +title +" 저자:"+author + " 대여유무: "+ s);
//    }
}
