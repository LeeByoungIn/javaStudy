package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		System.out.println("if문 예제");
		
		Scanner scn =new Scanner(System.in);
		
		System.out.println("퀴리문을 입력해서(insert,update,select,delete");
		
		String str=scn.nextLine();
		
		if(str.equals("insert")) {
			System.out.println("회원 가입 페이지로 이동합니다.");
		}else if(str.equals("update")) {
			System.out.println("회원 수정 페이지로 이동합니다.");
		}else if(str.equals("selecet")) {
			System.out.println("회원 조회 페이지로 이동합니다.");
		}else if(str.equals("delete")) {
			System.out.println("회원 탈퇴 페이지로 이동합니다.");
		}
		
	}
}
