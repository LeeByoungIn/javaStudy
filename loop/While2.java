package org.java.loop;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("while");
		
		int i=2;
		while(i<10) {
			System.out.println(i+"���Դϴ�.");
		int j=1;
		while(j<10) {
			System.out.println(i+"*"+"="+(i*j));
			j++;
		
		}
		i++;
	}
		//Scanner���� �Է´� ������ �̿��ؼ� �������� ����غ�����
		Scanner scn =new Scanner(System.in);
		int startNum=scn.nextInt();
		
		int i2 =startNum;
		while(i2<10) {
			System.out.println(i2+"���Դϴ�");
			
			int j=1;
			while(j<10) {
				System.out.println(i2+"*"+j+"="+(i2*j));
			j++;
			}
			i2++;
		}
		
	
		
	}
}
