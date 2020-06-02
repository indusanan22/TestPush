package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumOptimal {

	public static void main(String[] args) {
		System.out.println(prime(25));
	}

	static List<Integer> prime(int n) {
		List<Integer> a = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (primeCheck(i)) {
				a.add(i);
			}
		}
		return a;
	}

	static boolean primeCheck(int n) {
		boolean check = true;
		if (n <= 1) {
			check = false;
		}
		if (n <= 3) {
			return check;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			check = false;
		}
		for (int i = 5; i <= Math.sqrt(n); i += 6) {
			if (n % i == 0 || n % i + 2 == 0) {
				check = false;
			}
		}
		return check;
	}

}
