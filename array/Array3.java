package org.java.array;

public class Array3 {
	public static void main(String[] args) {
		System.out.println("배열");
		char[] ch= {'C','A','F','E'};
		
		String s1 = new String (ch); //char 배열 -> String(문자열)변환
		System.out.println(s1);
		System.out.println(s1.contentEquals("CAFE"));
		
		String[] binnery = {
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1110",
				"1100","1101","1110","1111"
		};
		String result="";
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') { //0=48 9=57
				result+=binnery[ch[i]-'0'];
			}else {
				result+=binnery[ch[i]-'A'+10];// A=65
			}						//'C'-'A'+10=12
		}
		System.out.println("ch="+new String(ch));
		System.out.println("ch="+String.copyValueOf(ch));
		System.out.println(result);
		}
	}

