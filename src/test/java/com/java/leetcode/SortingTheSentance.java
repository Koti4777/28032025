package com.java.leetcode;

public class SortingTheSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "is2 sentence4 This1 a3";
		
		String[] words = input.split(" ");
		String[] wordsWithCorrectPosition = new String[words.length];
		
		for (String word:words) {
			
			int index = Character.getNumericValue(word.charAt(word.length()-1));
			wordsWithCorrectPosition[index-1] = word.substring(0,word.length()-1);
		}
		
		String output = String.join(" ", wordsWithCorrectPosition);
		System.out.println(output);
		
	}

}
