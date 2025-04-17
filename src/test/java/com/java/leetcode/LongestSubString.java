package com.java.leetcode;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestSubStringLength("Hello World!!!"));
		System.out.println(longestSubString("Hello World!!!"));
		
	}


	public static String longestSubString(String input) {

		int left =0; int right =0; int maxlength = 0;
		HashSet<Character> charSet = new HashSet<>();

		while (right<input.length()) {

			if (!charSet.contains(input.charAt(right))) {

				charSet.add(input.charAt(right));
				maxlength = Math.max(maxlength, right-left+1);
				right++;
			}else {
				charSet.remove(input.charAt(left));
				left++;
			}

		}
		return input.substring(left,right);

	}
	public static int longestSubStringLength(String input) {

		int left =0; int right =0; int maxlength = 0;
		HashSet<Character> charSet = new HashSet<>();

		while (right<input.length()) {

			if (!charSet.contains(input.charAt(right))) {

				charSet.add(input.charAt(right));
				maxlength = Math.max(maxlength, right-left+1);
				right++;
			}else {
				charSet.remove(input.charAt(left));
				left++;
			}

		}
		return maxlength;

	}
}
