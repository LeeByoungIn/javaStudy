package org.java.condition;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자(정수) 입력");
		int num1 = scn.nextInt();
		
		System.out.println("두번째 숫자(정수) 입력");
		int num2 = scn.nextInt();
		
		System.out.println("연산 기호를 입력하세요(+-*/)");
		int op = scn.next().charAt(0);
		
		int result=0;
		
		switch(op) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '%':
				result=num1%num2;
				break;
			}// break문 위치
		System.out.println("연산의 결과 : "+num1+" "+op+" "+num2+" = "+result);
	}
}
