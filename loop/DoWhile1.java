package org.java.loop;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		System.out.println("dowhile");
		int i=2;
		do {
			System.out.println(i+"???Դϴ?");
			
			int j=1;
			do {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}while(j<10);
			i++;
		}while(i<10);
		
		
		
	}
}
