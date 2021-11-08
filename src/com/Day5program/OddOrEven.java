package com.Day5program;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the number n=");
		int n=obj.nextInt();
		if( n%2 == 0 ) {
			System.out.println("entered number is even");
		}
		else{
			System.out.println("entered number is odd");
		}
	}

}
