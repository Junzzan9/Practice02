package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.print("큰수:"+num1+"     작은수: "+num2);
		}
		else {
			System.out.print("큰수:"+num2+"     작은수: "+num1);
		}
		
		System.out.println("입니다.");
		sc.close();

	}

}
