package org.java.loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		System.out.println("==================");
		for (int g = 9; g < 1; g--) {
			System.out.println(g + "단입니다");
			for (int h = 9; h < 0; h--) {
				System.out.println(g + "*" + h + "=" + (g * h));
			}
		}
		System.out.println("==================");
		// Scanner클래스 이용해서 시작단을 입력받아서 구구단을 입력단 ~9단까지 출력
		System.out.println("구구단 시작단을 입력하세요");
		Scanner scn = new Scanner(System.in);
		System.out.println("시작단입력");
		int startNum = scn.nextInt();
		System.out.println("끝단입력");
		int endNum = scn.nextInt();

		if (startNum > endNum) {
			System.out.println("시작단이 끝단보다 작거나 같아야합니다");
		} else {
			for (int d = startNum; d < endNum + 1; d++) {
				System.out.println(d + "단입니다");
				for (int f = 1; f < 10; f++) {
					System.out.println(d + "*" + f + "=" + (d * f));
				}
				for (int i = startNum; i < 10; i++) {
					System.out.println(i + "단입니다");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + "*" + j + "=" + (i * j));

					}
				}
			}
		}
	}
}
