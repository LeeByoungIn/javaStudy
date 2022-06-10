package org.java.varable2;

public class PrintlnEx {

	public static void main(String[] args) {
		
		//자동으로 줄바꿈
		System.out.println(10+10);
		System.out.println(10+"10");
		System.out.println(10+10+"10");
		System.out.println(10+"10"+10);
		System.out.println(10+10+"");
		
		
		System.out.print("띄어쓰기 없다");
		System.out.println("%d ,1000"); //포맷 C언어에서 많이 사용
	
		int num1=10;
		int num2=10;
	
		System.out.println(num1+"+"+num1+"="+(num1 + num2));
	}
}
