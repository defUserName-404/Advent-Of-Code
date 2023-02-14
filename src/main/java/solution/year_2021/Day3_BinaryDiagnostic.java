package solution.year_2021;

import solution.Solution;

import java.util.HashMap;

public class Day3_BinaryDiagnostic extends Solution<Integer> {
	@Override
	public Integer part1() {
		HashMap<Integer, Integer> occurrenceOfZeroInColumn = new HashMap<>();
		StringBuilder gamma = new StringBuilder(), epsilon = new StringBuilder();
		int n = getInput().get(0).length();
		int total = getInput().size();

		for (final String current : getInput()) {
			for (int idx = 0; idx < n; idx++) {
				if (current.charAt(idx) == '0') {
					if (occurrenceOfZeroInColumn.get(idx) == null)
						occurrenceOfZeroInColumn.put(idx, 1);
					else
						occurrenceOfZeroInColumn.put(idx, occurrenceOfZeroInColumn.get(idx) + 1);
				}
			}
		}

		for (int idx = 0; idx < n; idx++) {
			int x = occurrenceOfZeroInColumn.get(idx);

			if (x <= total - x) {
				gamma.append("1");
				epsilon.append("0");
			} else {
				gamma.append("0");
				epsilon.append("1");
			}
		}

		int gammaInDecimal = Integer.parseInt(gamma.toString(), 2);
		int epsilonInDecimal = Integer.parseInt(epsilon.toString(), 2);
		int ans = gammaInDecimal * epsilonInDecimal;
		displayOutput(String.valueOf(ans));

		return ans;
	}

	@Override
	public Integer part2() {
		return null;
	}
}