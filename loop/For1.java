package org.java.loop;

public class For1 {
	public static void main(String[] args) {
		System.out.println("for문");
		
		for(int i=0; i<10; i++) {
//			System.out.print(i+" ");
			
//			int i2=i+1;
//			System.out.println(i2);
			
		if(i==9) {
			System.out.print((i+1));
			break; //하위 명령문을 실행 안함
		}
			System.out.print((i+1)+",");
	}//break문
		for(int i=0; i<10; i++) {
			
//			String url="";
			System.out.println("url(img/bg"+i+".jpg)no - rpeat 50%/cover");
		}
	}
}
