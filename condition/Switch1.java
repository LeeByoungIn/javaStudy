package org.java.condition;

import java.util.Scanner;

import org.java.varable2.Scanner1;

public class Switch1 {
	public static void main(String[] args) {
		System.out.println("switch");
		
		System.out.println("������ �Է��ϼ��� ");
		
		Scanner scn = new Scanner(System.in);
		
		int key=scn.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("�ְ� �������Դϴ�");
			break;
		case 2:
			System.out.println("�߰� ������ �Դϴ�");
			break;
		case 3:
			System.out.println("�Ϲݻ�� �Դϴ� �Դϴ�");
			break;	
		default:
			System.out.println("��ȯ�� �����ϴ�");
		}
		scn.close();
	}
	
}
