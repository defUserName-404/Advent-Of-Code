package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2_DiveTest {

	private final Day2_Dive day2Solution;

	Day2_DiveTest() {
		this.day2Solution = new Day2_Dive();
	}

	@Test
	public void part1() {
		int ans = day2Solution.part1();
		Assertions.assertEquals(ans, 150);
	}
}