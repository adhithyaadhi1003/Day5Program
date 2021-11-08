package com.Day5program;
import java.util.Scanner;

public class QuotientRem {

	public static void main(String[] args) {
		double a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number n=");
		int n=obj.nextInt();
		a=(n%5);
		b=(n/5);
		System.out.println("divide by 5 the remainder is :" +a);
		System.out.println("divide by 5 the quotient is :" +b);

	}

}


