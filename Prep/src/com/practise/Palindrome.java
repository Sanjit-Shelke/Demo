package com.practise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Please enter value to check for Palindrome");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if(isPalindrome(input))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		sc.close();
	}

	public static boolean isPalindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}
}
