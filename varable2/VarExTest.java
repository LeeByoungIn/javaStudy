package org.java.varable2;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		System.out.println("���� ���̸� ���Ͻÿ�.");
		
		Scanner scn =new Scanner(System.in);
		final double PI=3.14;
		System.out.println("������ �Է��ϼ���");
		int radius=scn.nextInt();
		
		double circleNum=radius*radius*PI;
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		
		System.out.println("���� ���� : " +circleNum);
	}
}
