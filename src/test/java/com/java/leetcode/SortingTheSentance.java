package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortingTheSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "is2 sentence4 This1 a3";
		System.out.println("With Array---"+sortSentance(input));
		System.out.println("With ArrayList---"+sortSentanceWithArrayList(input));
	}

	public static String sortSentance (String input){
		if (input==null || input.trim().isEmpty()){
				return "";
		}
		String[] words = input.split(" ");
		String[] wordsWithCorrectPosition = new String[words.length];

		for (String word:words) {

			int index = Character.getNumericValue(word.charAt(word.length()-1));
			wordsWithCorrectPosition[index-1] = word.substring(0,word.length()-1);
		}

        return String.join(" ", wordsWithCorrectPosition);
	}
	
	public static String sortSentanceWithArrayList (String input){
		if (input==null || input.trim().isEmpty()){
				return "";
		}
		String[] words = input.split(" ");
		ArrayList<String> wordsWithCorrectPosition = new ArrayList<>(List.of(words));

		for (String word:words) {

			int index = Character.getNumericValue(word.charAt(word.length()-1));
			wordsWithCorrectPosition.set(index-1, word.substring(0,word.length()-1));
			
		}

        return String.join(" ", wordsWithCorrectPosition);
	}

}
