package org.java.varable;

public class VarEx2 {

	public static void main(String[] args) {
	
		System.out.println("변수");
		
		
		// 1byte =8bit -2^7~+2^7-1 -128~+127
		// 정수형 데이터
		byte b=10; //1byte 저장 할 수 있는 변수 b를 선언하고 10으로 초기화 했다.
		short s=10;//2byte 저장 할 수 있는 변수 s를 선언하고 10으로 초기화 했다.
		int i=10;//4byte 저장 할 수 있는 변수 i를 선언하고 10으로 초기화 했다.
		long l=101;//8byte 저장 할 수 있는 변수 l를 선언하고 10으로 초기화 했다.
		//실수형 데이터
		float f=1.1f;//실수형 데이터 4byte를 저장할 수 있는 f를 선언하고 1.1f로 초기화 했다.
		double d=1.1;//실수형 데이터 8byte를 저장할 수 있는 f를 선언하고 1.1f로 초기화 했다.
		
		char ch='a'; //문자형 데이터 2byte를 할수 있는 변수 ch를 선언하고 'a'로 초기화 했다. 
		
		boolean bool=false; // boolean형 1byte를 저장 할수 있는 변수 bool를 선언하고 false로 초기화 했다.
	}
}
