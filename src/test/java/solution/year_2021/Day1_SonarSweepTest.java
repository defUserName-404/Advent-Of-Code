package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution;

class Day1_SonarSweepTest {

	private final Solution<Integer> solution;

	Day1_SonarSweepTest() {
		this.solution = new Day1_SonarSweep();
	}

	@Test
	public void part1() {
		int ans = solution.part1();
		Assertions.assertEquals(ans, 7);
	}

}
