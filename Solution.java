package com.recursion;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() + 1;

		String[] arr = new String[n];
		int i = 0;
		while (i < n) {
			arr[i] = scanner.nextLine();
		}
		int wLength = arr[i].toCharArray().length;
		for (int j = 0; j < wLength; j++) {
			if (j % 2 == 0) {
				System.out.print(arr[j]);
			}
		}
		for (int j = 0; j < wLength; j++) {
			if (j % 2 != 0) {
				System.out.print(" " + arr[j]);
			}
		}

	}
}