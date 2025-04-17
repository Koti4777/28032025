package com.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		 int[] nums = {2, 7, 11, 15};
	        int target = 9;

	        int[] result = twoSum(nums, target);
	        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		

	}
	
	public static int[] twoSum (int[] input, int target) {
		
		HashMap<Integer, Integer> arrayMap = new HashMap<>();
		for (int i=0;i<input.length;i++) {
			
			int complement = target-input[i];
			
			if (arrayMap.containsKey(complement)) {// checking if the pair is present in map if present returning the both the values
				return new int[] {arrayMap.get(complement), i};
			}
			
			arrayMap.put(input[i], i); // if the pair not present adding value to map for further loop
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
