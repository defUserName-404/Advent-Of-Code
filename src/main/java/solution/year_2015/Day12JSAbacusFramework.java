package solution.year_2015;

import solution.Solution;

public class Day12JSAbacusFramework extends Solution<Integer> {

	@Override
	public Integer part1() {
		String string = getInput().get(0);
		int sum = 0;
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if ((i <= string.length() - 2) && (ch == '-') && Character.isDigit(string.charAt(i + 1))) {
				temp.append(ch);
				continue;
			}
			if (Character.isDigit(ch)) {
				temp.append(ch);
			}
			else {
				if (!temp.isEmpty()) {
					sum += Integer.parseInt(temp.toString());
				}
				temp.setLength(0);
			}
		}
		if (!temp.isEmpty()) {
			sum += Integer.parseInt(temp.toString());
		}
		displayOutput(Integer.toString(sum));
		return sum;
	}

	@Override
	public Integer part2() {
		return 0;
	}

}
