package org.java.loop;

public class While1 {
	public static void main(String[] args) {
		System.out.println("while");
		for (int i =0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("=====================");
		int i=0;
		
		while ( i < 10) {
			System.out.println(i);
			
		}
		System.out.println("====================");
		
		int i2=0;
		
		while(true) {
			
			System.out.println(i2);
			
			if(i2>=9) break;
				
			i2++;	
			}
			
		}
	}

