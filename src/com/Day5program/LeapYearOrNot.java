
package com.Day5program;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter the year :");
		int year=scanner.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
			System.out.println("its a leap year ");
		}else {
			System.out.println("its not a leap year");

	}

}

	}


