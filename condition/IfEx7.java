package org.java.condition;

import java.util.Scanner;

public class IfEx7 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("if�� ����");
		int kor, eng, math;
		
		System.out.println("���� ���� ���� ������ �Է� ���� ��� ���� ���");
		System.out.println("����: ");
		kor = scn.nextInt();
		System.out.println("����: ");
		eng = scn.nextInt();
		System.out.println("����: ");
		math =scn.nextInt();
		
		int sum = kor+ eng+ math;
		double avg = (double)sum/3;
		System.out.println("���� :"+sum+", ���: "+avg);
		if(avg>=90) {
			if(avg>=95) {
			System.out.println("A+");
			}else {
				System.out.println("A-");
			}
		}else if(avg>=80) {
			if(avg>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}	
		}else if(avg>=70) {
			if(avg>=75) {
				System.out.println("C+");
			}else {
			System.out.println("C");
			}
		}else if(avg>=60) {
			if(avg>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
			}else {
			System.out.println("F");
		}
		
		
	}
}
