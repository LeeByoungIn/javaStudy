package org.java.condition;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("아이디입력");
		String userId=scn.nextLine();
		System.out.println("비밀번호 입력");
		String userPw=scn.nextLine();
		if(userId.equals("root") && userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요");
		}else {
			System.out.println("회원이 아니시군요");
		}
		System.out.println("=================");
		if(userId.equals("root") || !userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요");
		}else {
			System.out.println("회원이 아니시군요");
		}
	}
}
