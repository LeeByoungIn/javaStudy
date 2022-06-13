package org.java.array;

public class LottoEx {
	public static void main(String[] args) {
		System.out.println("배열 예제");
		
		int[] lotto = new int[45]; //0~44번지
		for(int i =0; i<lotto.length; i++) {
			lotto[i]=i+1; //1~45정수
		}
		int box=0;
		
		for(int i=0; i<10000; i++) {
			int idx=(int)(Math.random()*45);// 배열의 임의의 번지를 추출
			box=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=box;
		}
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+",");// lotto 배열의 0번지부터 5번지까지 값을 추출
		}
	}
}
