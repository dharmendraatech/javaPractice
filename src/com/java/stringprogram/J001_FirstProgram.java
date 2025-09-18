package com.java.stringprogram;

public class J001_FirstProgram {
	
	public void addTwoNum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of Two Digit ::"+sum);
	}
	
	public void subTwoNum(int a, int b) {
		int sub =0;
		if(a>b) {
			sub = a-b;
		}else {
			sub = b-a;
		}
		System.out.println("Sum of Two Digit ::"+sub);
	}

	public static void main(String[] args) {

		System.out.println("Hello World!");
		J001_FirstProgram fp= new J001_FirstProgram();
		
		fp.addTwoNum(10, 15);
		fp.subTwoNum(15, 12);
		fp.subTwoNum(15, 21);
		//System.out.println("Sum of Two Digit is :"+x);
	}

}
