package org.java.array;

public class Array6 {

	public static void main(String[] args) {
		int[][] score = { { 100, 66, 77 }, { 88, 66, 88 }, { 70, 88, 80 }, { 100, 90, 88 } };
		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length;
		
		int totalSum=0;
		System.out.println("�߰���� ����ǥ");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("==============================================");

		for (int i = 0; i < scoreLength; i++) {
			int sum = 0;
			System.out.print((i + 1) + "\t"); // ��ȣ

			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				totalSum+=score[i][j];
			}
			avg = Math.round(sum / (double) score[i].length);
			// ���� //���
			System.out.println(sum + "\t" + avg);
		}
		System.out.println("===============================================");
		System.out.println("����:\t" + kor + "\t" + eng + "\t" + math+"\t"+totalSum);
	}

}
