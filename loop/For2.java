package org.java.loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		System.out.println("for��");

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���Դϴ�");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		System.out.println("==================");
		for (int g = 9; g < 1; g--) {
			System.out.println(g + "���Դϴ�");
			for (int h = 9; h < 0; h--) {
				System.out.println(g + "*" + h + "=" + (g * h));
			}
		}
		System.out.println("==================");
		// ScannerŬ���� �̿��ؼ� ���۴��� �Է¹޾Ƽ� �������� �Է´� ~9�ܱ��� ���
		System.out.println("������ ���۴��� �Է��ϼ���");
		Scanner scn = new Scanner(System.in);
		System.out.println("���۴��Է�");
		int startNum = scn.nextInt();
		System.out.println("�����Է�");
		int endNum = scn.nextInt();

		if (startNum > endNum) {
			System.out.println("���۴��� ���ܺ��� �۰ų� ���ƾ��մϴ�");
		} else {
			for (int d = startNum; d < endNum + 1; d++) {
				System.out.println(d + "���Դϴ�");
				for (int f = 1; f < 10; f++) {
					System.out.println(d + "*" + f + "=" + (d * f));
				}
				for (int i = startNum; i < 10; i++) {
					System.out.println(i + "���Դϴ�");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + "*" + j + "=" + (i * j));

					}
				}
			}
		}
	}
}
