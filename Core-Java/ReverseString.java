package com.hcl.assessment;


public class ReverseString {
	
	public static String reverseString(String str) {
		if (str == null) {
			return str;
		}
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length-1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(ReverseString.reverseString("Java Programs"));
		System.out.println(ReverseString.reverseString("Amit Kumar"));
	}

}
