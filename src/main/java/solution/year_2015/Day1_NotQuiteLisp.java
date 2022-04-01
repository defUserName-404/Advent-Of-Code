package solution.year_2015;

import util.IO;

import java.util.ArrayList;

public class Day1_NotQuiteLisp {
	public static int part1() {
		int count = 0;
		ArrayList<String> input = IO.getInstance().readFile();

		for (final String current : input) {
			for (final char currentChar : current.toCharArray()) {
				if (currentChar == '(')
					count++;
				else if (currentChar == ')')
					count--;
			}
		}
		IO.getInstance().writeToFile(String.valueOf(count));
		return count;
	}
}