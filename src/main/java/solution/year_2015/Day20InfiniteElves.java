package solution.year_2015;

import solution.Solution;

public final class Day20InfiniteElves extends Solution<Integer> {

	private static final int INPUT = Integer.parseInt(getInput().get(0));

	@Override
	public Integer part1() {
		int houseNo = 1;
		while (true) {
			int count = 0;
			for (int i = 1; i * i <= houseNo; i++) {
				if (houseNo % i == 0) {
					count += (i * 10);
					if (i * i != houseNo) {
						count += ((houseNo / i) * 10);
					}
				}
			}
			if (count >= INPUT) {
				break;
			}
			houseNo++;
		}
		displayOutput(String.valueOf(houseNo));
		return houseNo;
	}

	@Override
	public Integer part2() {
		return null;
	}

}
