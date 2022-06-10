package org.java.condition;

import java.util.Scanner;

public class IfEx7 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("if문 예제");
		int kor, eng, math;
		
		System.out.println("국어 영어 수학 점수를 입력 총점 평균 학점 평균");
		System.out.println("국어: ");
		kor = scn.nextInt();
		System.out.println("영어: ");
		eng = scn.nextInt();
		System.out.println("수학: ");
		math =scn.nextInt();
		
		int sum = kor+ eng+ math;
		double avg = (double)sum/3;
		System.out.println("총점 :"+sum+", 평균: "+avg);
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
