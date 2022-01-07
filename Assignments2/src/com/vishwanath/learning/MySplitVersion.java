package com.vishwanath.learning;

import java.util.Scanner;

public class MySplitVersion {


	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		String Delimiter = " ";
		
		splitfunc(str,Delimiter);
		
	}
		
		static void splitfunc(String str, String delimeter) {

		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				
				System.out.println();
				
				continue;
				
			}
			System.out.println(str.charAt(i));
		}
		
	}

}
