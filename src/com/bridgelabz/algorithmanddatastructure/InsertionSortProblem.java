package com.bridgelabz.algorithmanddatastructure;

import java.util.Scanner;

public class InsertionSortProblem {
	public static void insertionSort(String[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read in the list of words
		System.out.print("Enter the list of words, separated by spaces: ");
		String input = sc.nextLine();
		String[] words = input.split("\\s+");

		// Call insertionSort to sort the words
		insertionSort(words);

		// Print the sorted list of words
		System.out.print("Sorted list of words: ");
		for (String word : words) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
}
