package com.Day5program;
import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		double i,sum=0;
		
		Scanner obj =new Scanner (System.in);
		System.out.println("enter the Harmoonic Limit n= ");
		int n=obj.nextInt();
		System.out.println("the hadrmonic series is ");
		for(i=1;i<=n;i++){
			sum=sum+(1/i);
			System.out.println(" " +sum);
		}
	}

}
