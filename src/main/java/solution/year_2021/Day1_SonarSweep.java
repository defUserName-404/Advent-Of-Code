package solution.year_2021;

import util.IO;

import java.util.ArrayList;

public class Day1_SonarSweep {
	public static int part1() {
		ArrayList<String> input = IO.getInstance().readInputFile();
		int increaseCount = 0;
		int prev = Integer.parseInt(input.get(0));

		for (final String num : input) {
			int currentNum = Integer.parseInt(num);
			if (currentNum > prev)
				increaseCount++;
			prev = currentNum;
		}
		IO.getInstance().writeToOutputFile(String.valueOf(increaseCount));
		return increaseCount;
	}
}