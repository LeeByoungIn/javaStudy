package org.java.condition;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int grade=scn.nextInt();
		
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}else if(grade>=60) {
			System.out.println("d");
		}else {
			System.out.println("F");
		}
		
	}
}
