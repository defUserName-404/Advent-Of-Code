package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day3_PerfectlySphericalHousesTest {

	private final Day3_PerfectlySphericalHouses day3Solution;

	Day3_PerfectlySphericalHousesTest() {
		this.day3Solution = new Day3_PerfectlySphericalHouses();
	}

	@Test
	void part1() {
		int ans = day3Solution.part1();
		Assertions.assertEquals(ans, 4);
	}
}