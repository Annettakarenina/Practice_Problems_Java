package practiceProblems;

import java.util.Scanner;

public class ReverseStringAndCheckPalindrome {

	public static void main(String[] args) {
//		String s="victory";
//		
//		//method 1 using loop
//		String reverse="";
//		int len=s.length();
//		for(int i=len-1; i>=0; i--) {
//			reverse=reverse+s.charAt(i);
//		}
//		System.out.println(reverse);
//		
//		//method 2 with StringBuffer class
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
			checkPalindrome("perfect");
		}
	
	public static void checkPalindrome(String word) {
		
		String w=word;
		String reverse="";
		int len=w.length();
		for(int i=len-1; i>=0; i--) {
			reverse=reverse+w.charAt(i);
		}
		System.out.println(reverse);
		
		if(w.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}

