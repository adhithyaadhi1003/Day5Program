package com.Day5program;
import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the numbers");
		System.out.println("enter the first number a=");
		int a=obj.nextInt();
		System.out.println("enter the first number b=");
		int b=obj.nextInt();
		System.out.println("enter the first number c=");
		int c=obj.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest among three numbers");
			}else {
				System.out.println("b is largest among three numbers");
			}
		}else {
			System.out.println("c is largest among three numbers");
		}
	}

}
