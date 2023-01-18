package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution;

public class Day3PerfectlySphericalHousesTest {

	private final Solution<Integer> solution;

	Day3PerfectlySphericalHousesTest() {
		this.solution = new Day3_PerfectlySphericalHouses();
	}

	@Test
	void part1() {
		int ans = solution.part1();
		Assertions.assertEquals(ans, 4);
	}

}
