package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익를 입력해 주세요");
		System.out.print("금액: ");
		double gain = sc.nextDouble();
		
		if(gain>=8000) {
			System.out.print("소득세는 "+((1000*0.09)+(3000*0.18)+(4000*0.27)+(0.36*(gain-8000)))+("입니다"));
		}
		else if (gain>4000) {
			System.out.print("소득세는 "+((1000*0.09)+(3000*0.18)+(0.27*(gain-4000)))+("입니다"));
		}
		else if (gain>1000) {
			System.out.print("소득세는 "+((1000*0.09)+(0.18*(gain-1000)))+("입니다"));
		}
		else if (gain>=0) {
			System.out.print("소득세는 "+(0.09*gain)+("입니다"));
		}
		else {
			System.out.print("잘못 입력했습니다.");
		}
		sc.close();
	}

}
