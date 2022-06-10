package org.java.operator;

public class Operator3 {
	public static void main(String[] args) {
		System.out.println("논리연산자(왼쪽)");
		System.out.println("&& 모든 조건이 true일때만 true");
		
		String userId="m1111";
		String userPw="1111";
		
		System.out.println(userId=="m1111" && userPw=="1111");
		System.out.println(userId=="m1111" && userPw=="2111");
		System.out.println(userId=="m1112" && userPw=="1111");
		System.out.println(userId=="m1112" && userPw=="2111");
		
		if(userId!="m1111" || userPw!="1111"){
			System.out.println("로그인 실패");
	    }else {
	    	System.out.println("로그인 성공");
	    }
	}	   
}		
