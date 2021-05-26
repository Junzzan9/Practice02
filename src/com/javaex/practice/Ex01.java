package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		
		//if 조건설정 에 &&가 빠져있어서 오류가 발생했다.
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면 
		if (age>0&&age<18) {
			System.out.println("청소년 입니다.");
		}
	}
}
