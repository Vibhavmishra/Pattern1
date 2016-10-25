package com.avalia.Pattern;

public class largestTwo {

	public void TwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}

	public static void main(String a[]) {
		int num[] = { 105, 34, 78, 2, 45, 1, 993, 23 };
		largestTwo lt = new largestTwo();
		lt.TwoMaxNumbers(num);

	}

}
