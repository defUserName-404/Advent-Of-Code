package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import solution.Solution;

class Day5InternElvesTest {

	private static Solution<Integer> solution;

	@BeforeAll
	static void setup() {
		solution = new Day5InternElves();
	}

	@Test
	void part1() {
		Assertions.assertEquals(5, solution.part1());
	}

	@Test
	void part2() {
		Assertions.assertEquals(5, solution.part2());
	}

}
