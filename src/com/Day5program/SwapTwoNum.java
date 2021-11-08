package com.Day5program;
import java.util.Scanner;
public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int temp;
		System.out.println("enter the numbers two be swap");
		System.out.println("enter the First number a=");
		int a=scan.nextInt();
		System.out.println("enter the Second number b=");
		int b=scan.nextInt();
		temp=a;
		a=b;
		b=a;
		System.out.println("after swapping the value of a is: " +a);
		System.out.println("after swapping the value of b is: " +b);
	}


}


