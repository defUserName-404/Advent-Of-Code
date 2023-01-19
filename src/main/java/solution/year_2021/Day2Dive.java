package solution.year_2021;

import solution.Solution;

public final class Day2Dive extends Solution<Integer> {

	@Override
	public Integer part1() {
		int x = 0, y = 0;
		for (final String currentCommand : getInput()) {
			String[] parts = currentCommand.split(" ");
			String command = parts[0];
			int value = Integer.parseInt(parts[1]);
			switch (command) {
				case "forward" -> x += value;
				case "up" -> y -= value;
				case "down" -> y += value;
			}
		}
		int multiplicationResult = x * y;
		displayOutput(String.valueOf(multiplicationResult));
		return multiplicationResult;
	}

	@Override
	public Integer part2() {
		return null;
	}

}
