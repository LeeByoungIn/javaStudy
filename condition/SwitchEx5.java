package org.java.condition;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ����(����) �Է�");
		int num1 = scn.nextInt();
		
		System.out.println("�ι�° ����(����) �Է�");
		int num2 = scn.nextInt();
		
		System.out.println("���� ��ȣ�� �Է��ϼ���(+-*/)");
		int op = scn.next().charAt(0);
		
		int result=0;
		
		switch(op) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '%':
				result=num1%num2;
				break;
			}// break�� ��ġ
		System.out.println("������ ��� : "+num1+" "+op+" "+num2+" = "+result);
	}
}
