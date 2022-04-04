package solution.year_2015;

import util.IO;

import java.util.ArrayList;

public class Day1_NotQuiteLisp {
	private static final ArrayList<String> input = IO.getInstance().readInputFile();
	private static int count = 0;

	private static void followInstructions(char currentChar) {
		if (currentChar == '(')
			count++;
		else if (currentChar == ')')
			count--;
	}

	public static int part1() {
		count = 0;

		for (final String current : input)
			for (final char currentChar : current.toCharArray())
				followInstructions(currentChar);

		IO.getInstance().writeToOutputFile(String.valueOf(count));

		return count;
	}

	public static int part2() {
		count = 0;
		int ans = 0;

		for (final String current : input) {
			for (int i = 0; i < current.length(); i++) {
				followInstructions(current.charAt(i));

				if (count == -1) {
					ans = i + 1;
					break;
				}
			}
		}

		IO.getInstance().writeToOutputFile(String.valueOf(ans));

		return ans;
	}
}