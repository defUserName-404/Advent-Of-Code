package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1_SonarSweepTest {

	private final Day1_SonarSweep day1Solution;

	Day1_SonarSweepTest() {
		this.day1Solution = new Day1_SonarSweep();
	}

	@Test
	public void part1() {
		int ans = day1Solution.part1();
		Assertions.assertEquals(ans, 7);
	}
}