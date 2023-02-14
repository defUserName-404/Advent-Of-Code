package solution.year_2022;

import solution.Solution;

public class Day1_CalorieCounting extends Solution<Long> {

	@Override
	public Long part1() {
		long max = Long.MIN_VALUE;
		long currentColorie = 0;

		for (String colorie : getInput()) {
			if (colorie.equals("")) {
				currentColorie = 0;
				continue;
			}
			currentColorie += Long.parseLong(colorie);
			max = Math.max(max, currentColorie);
		}

		displayOutput(String.valueOf(max));

		return max;
	}

	@Override
	public Long part2() {
		return null;
	}
}
