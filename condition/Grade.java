package org.java.condition;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	//contstruct(������)
	public Grade(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public void sumGrade() { //�ż���(method)
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+math);
		int sum=kor+eng+math;
		System.out.println("����: "+sum);
	}
	public void avgGrade() { //�ż���(method)
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("���: "+avg);
	}	
	public double avgGet() { //�ż���(method)
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	
	}
}
