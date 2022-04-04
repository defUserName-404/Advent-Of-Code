package solution.year_2021;

import util.IO;

import java.util.ArrayList;
import java.util.HashMap;

public class Day3_BinaryDiagnostic {
	public static int part1() {
		ArrayList<String> input = IO.getInstance().readInputFile();
		HashMap<Integer, Integer> occurrenceOfZeroInColumn = new HashMap<>();
		StringBuilder gamma = new StringBuilder(), epsilon = new StringBuilder();
		int n = input.get(0).length();
		int total = input.size();

		for (final String current : input) {
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
		IO.getInstance().writeToOutputFile(String.valueOf(ans));

		return ans;
	}
}