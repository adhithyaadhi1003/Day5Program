package com.Day5program;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		int i,count=0;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the number=");
		int n=obj.nextInt();
		for (i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==0) {
				System.out.println("Entered number is prime number");
			}
			else
				System.out.println("Entered number is not a prime number");
		
	}

}
