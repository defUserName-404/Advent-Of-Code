package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution;

class Day2_DiveTest {

	private final Solution<Integer> solution;

	Day2_DiveTest() {
		this.solution = new Day2_Dive();
	}

	@Test
	public void part1() {
		int ans = solution.part1();
		Assertions.assertEquals(ans, 150);
	}

}
