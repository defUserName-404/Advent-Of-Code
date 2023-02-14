package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1_NotQuiteLispTest {

	private final Day1_NotQuiteLisp day1Solution;

	Day1_NotQuiteLispTest() {
		this.day1Solution = new Day1_NotQuiteLisp();
	}

	@Test
	public void part1() {
		int ans = day1Solution.part1();
		Assertions.assertEquals(ans, 0);
	}
}