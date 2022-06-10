package org.java.varable2;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		System.out.println("원의 넓이를 구하시오.");
		
		Scanner scn =new Scanner(System.in);
		final double PI=3.14;
		System.out.println("반지름 입력하세요");
		int radius=scn.nextInt();
		
		double circleNum=radius*radius*PI;
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		
		System.out.println("원의 넓이 : " +circleNum);
	}
}
