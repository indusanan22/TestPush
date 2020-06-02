package com.recursion;

public class Meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = meetingPoint(8, 3, 8, 2);
		if (j > 0) {
			System.out.println("They'll meet after exactly " + j + " jumps");
		} else {
			System.out.println("They'll not meet");
		}

	}

	static int meetingPoint(int p1, int p2, int s1, int s2) {
		int jumps = 0;
//		if ((p2 > p1 && s2 > s1) || ) {
//			jumps = 0;
//		}
		int r = (p1 - p2) % (s2 - s1);
		int n = (p1 - p2) / (s2 - s1);
		if (r == 0 && n > 0) {
			jumps = n;
		}
		return jumps;
	}

}
