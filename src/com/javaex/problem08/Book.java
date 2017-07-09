package com.javaex.problem08;

public class Book {
	
	public int bookNo;
	public String title;
	public String author;
	public int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
	}
	

    
	public void setBookNum(int bookNo) {
		this.bookNo=bookNo;
	}
	public int getBookNum(){
		return bookNo;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
    
	
	
	public void rent(int stateCode) {
		stateCode=0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	public void print() {
		if(stateCode==1) {
			System.out.println(bookNo+"  책 제목 :"+title+",	작가:"+author+",	대여유무: 재고있음");
		} else if(stateCode==0) {
			System.out.println(bookNo+"  책 제목 :"+title+",	작가:"+author+",	대여유무: 대여중");
		}
	}
    
    
    
}
