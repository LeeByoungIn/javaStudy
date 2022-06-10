package org.java.condition;

import java.util.Scanner;

public class Switch11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자(정수) 입력");
		int num1 = scn.nextInt();
		
		System.out.println("두번째 숫자(정수) 입력");
		int num2 = scn.nextInt();
		
		System.out.println("연산 기호를 입력하세요(+-*/)");
		int op = scn.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1 + num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1 - num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1 * num2));
			break;	
		case '/':
			System.out.println(num1+"/"+num2+"="+((double)num1 / num2));
			break;	
		default:
			System.out.println("연산자 입력오류");
		
		}
		
		
		
	}
}
