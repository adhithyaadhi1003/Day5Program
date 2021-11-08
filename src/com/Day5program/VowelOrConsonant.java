package com.Day5program;
import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the character to check string or not");
		char c = obj.next().charAt(0);
		switch (c) { 
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + "=entered character is vowel");
			break;
		default:
			System.out.println(c + "=entered character is consonant");
		}
	}

}
