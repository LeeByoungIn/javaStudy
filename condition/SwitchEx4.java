package org.java.condition;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력(1~100");
		int num = scn.nextInt();// 정수 입력
		char grade = ' ';
		switch(num/10)
		{
		case 10: //100
		case 9: //90
			grade='A';
			break;
		case 8: //80
			grade='B';
			break;
		case 7: //70
			grade='C';
			break;	
		case 6: //60
			grade='D';
			break;
		case 5: //50
			grade='F';
			break;
		default:
			grade='F';
		}
		System.out.println("학점 :" +grade);
	}
}
