package org.java.condition;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("���̵��Է�");
		String userId=scn.nextLine();
		System.out.println("��й�ȣ �Է�");
		String userPw=scn.nextLine();
		if(userId.equals("root") && userPw.equals("1111")) {
			System.out.println("��ſ� ���εǼ���");
		}else {
			System.out.println("ȸ���� �ƴϽñ���");
		}
		System.out.println("=================");
		if(userId.equals("root") || !userPw.equals("1111")) {
			System.out.println("��ſ� ���εǼ���");
		}else {
			System.out.println("ȸ���� �ƴϽñ���");
		}
	}
}
