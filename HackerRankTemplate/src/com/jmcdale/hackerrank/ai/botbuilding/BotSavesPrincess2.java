package com.jmcdale.hackerrank.ai.botbuilding;

import java.util.Scanner;

public class BotSavesPrincess2 {
	/* Head ends here */
	static void nextMove(int n, int r, int c, String[] grid) {
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n, r, c, grid);

	}
}