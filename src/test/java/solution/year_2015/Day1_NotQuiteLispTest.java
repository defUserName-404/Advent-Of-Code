package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution;

class Day1_NotQuiteLispTest {

	private final Solution<Integer> solution;

	Day1_NotQuiteLispTest() {
		this.solution = new Day1_NotQuiteLisp();
	}

	@Test
	public void part1() {
		int ans = solution.part1();
		Assertions.assertEquals(ans, 0);
	}

}
