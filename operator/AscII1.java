package org.java.operator;

public class AscII1 {

	public static void main(String[] args) {
		
		System.out.println('A');
		System.out.println((int)'A');
		
		char ch='A';
		System.out.println(ch);
		System.out.println((int)ch);
		//소문자 >>대문자
		//int형 아래 연산시 자동으로 int형으로 변환
		System.out.println('B'-'A');
		System.out.println('a'-'A');
		System.out.println('b'-32);//소문자 -> 대문자
		System.out.println('b');
		System.out.println((char)('b'-32));//int ->char
		//대문자 >> 소문자
		System.out.println('A');
		System.out.println('A'+32);
		System.out.println((char)('A'+32));System.out.println('b'-32);
		System.out.println('b');
		System.out.println((char)('b'-32));
		
	}
}
