package org.java.loop;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("while");
		
		int i=2;
		while(i<10) {
			System.out.println(i+"단입니다.");
		int j=1;
		while(j<10) {
			System.out.println(i+"*"+"="+(i*j));
			j++;
		
		}
		i++;
	}
		//Scanner에서 입력단 정수를 이용해서 구구단을 출력해보세요
		Scanner scn =new Scanner(System.in);
		int startNum=scn.nextInt();
		
		int i2 =startNum;
		while(i2<10) {
			System.out.println(i2+"단입니다");
			
			int j=1;
			while(j<10) {
				System.out.println(i2+"*"+j+"="+(i2*j));
			j++;
			}
			i2++;
		}
		
	
		
	}
}
