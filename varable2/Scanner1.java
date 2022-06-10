package org.java.varable2;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		int i1=scn.nextInt();
		
		System.out.println("국어: "+i1);
		
		int i2=scn.nextInt();
		
		System.out.println("영어: "+i2);
		
		int i3=scn.nextInt();
		
		System.out.println("수학: "+i3);
		
		System.out.println(i1+"+"+i2+"+"+i3+"="+(i1+i2+i3));
		System.out.println(i1+"+"+i2+"+"+i3+"/"+3+"="+((i1+i2+i3)/3));
		
	}
	
}
