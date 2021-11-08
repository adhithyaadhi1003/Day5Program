package com.Day5program;
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		int i;
		Scanner obj =new Scanner (System.in);
		System.out.println("enter the valu of n=");
		int n=obj.nextInt();
			for (i=1;i<=n ;i++) {
				double power = Math.pow(2, i);
				System.out.println("power values Of 2 is=" +power);
		}
	}

}
