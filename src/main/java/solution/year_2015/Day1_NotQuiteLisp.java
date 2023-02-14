package solution.year_2015;

import solution.Solution;

public final class Day1_NotQuiteLisp extends Solution<Integer> {

	private static int count = 0;

	private static void followInstructions(char currentChar) {
		count += currentChar == '(' ? 1 : -1;
	}

	@Override
	public Integer part1() {
		count = 0;

		for (final String current : getInput())
			for (final char currentChar : current.toCharArray())
				followInstructions(currentChar);

		displayOutput(String.valueOf(count));

		return count;
	}

	@Override
	public Integer part2() {
		count = 0;
		int ans = 0;

		for (final String current : getInput()) {
			for (int i = 0; i < current.length(); i++) {
				followInstructions(current.charAt(i));

				if (count == -1) {
					ans = i + 1;
					break;
				}
			}
		}

		displayOutput(String.valueOf(ans));

		return ans;
	}
}