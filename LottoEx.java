package org.java.array;

public class LottoEx {
	public static void main(String[] args) {
		System.out.println("�迭 ����");
		
		int[] lotto = new int[45]; //0~44����
		for(int i =0; i<lotto.length; i++) {
			lotto[i]=i+1; //1~45����
		}
		int box=0;
		
		for(int i=0; i<10000; i++) {
			int idx=(int)(Math.random()*45);// �迭�� ������ ������ ����
			box=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=box;
		}
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+",");// lotto �迭�� 0�������� 5�������� ���� ����
		}
	}
}
