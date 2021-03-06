package solution.year_2021;

import solution.Solution;

public class Day1_SonarSweep extends Solution<Integer> {
	@Override
	public Integer part1() {
		int increaseCount = 0;
		int prev = Integer.parseInt(input.get(0));

		for (final String num : input) {
			int currentNum = Integer.parseInt(num);
			if (currentNum > prev)
				increaseCount++;
			prev = currentNum;
		}

		displayOutput(String.valueOf(increaseCount));

		return increaseCount;
	}

	@Override
	public Integer part2() {
		return null;
	}
}