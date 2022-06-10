package org.java.condition;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		if(num1>10) {
			System.out.println("10보다 큽니다");
		}else {
			System.out.println("10보다 크지 않다");
		}
		System.out.println("======================");
		
		if(num1>=10 && num2<=20) {
			System.out.println("조건을 만족합니다");
		}else {
			System.out.println("조건을 충족하지 못했습니다.");
		}
	}
}
