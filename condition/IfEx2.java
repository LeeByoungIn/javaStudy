package org.java.condition;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		if(num1>10) {
			System.out.println("10���� Ů�ϴ�");
		}else {
			System.out.println("10���� ũ�� �ʴ�");
		}
		System.out.println("======================");
		
		if(num1>=10 && num2<=20) {
			System.out.println("������ �����մϴ�");
		}else {
			System.out.println("������ �������� ���߽��ϴ�.");
		}
	}
}
