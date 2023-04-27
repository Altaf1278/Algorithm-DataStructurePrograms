package com.bridgelabz.algorithmanddatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		String[] words = { "Altaf", "Rauf", "Suman", "Kiran", "Shaam", "Pallavi", "Raju" };

		Arrays.sort(words);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word to search: ");
		String word = scanner.nextLine();

		int index = binarySearch(words, word);

		if (index >= 0) {
			System.out.println("The word " + word + " was found at index " + index);
		} else {
			System.out.println("The word " + word + " was not found");
		}
	}

	private static int binarySearch(String[] words, String word) {
		int left = 0;
		int right = words.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int result = word.compareTo(words[mid]);
			if (result == 0) {
				return mid;
			} else if (result < 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}
}
