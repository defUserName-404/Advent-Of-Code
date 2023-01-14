package solution.year_2022;

import org.junit.jupiter.api.Test;
import solution.Solution;
import util.IO;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static solution.Solution.INPUT_FILE;

class Day1_CalorieCountingTest {

	private final Solution<Long> solution;

	Day1_CalorieCountingTest() {
		this.solution = new Day1_CalorieCounting();
	}

	@Test
	void part1_TC1() {
		IO.getInstance().concatToFile(INPUT_FILE, new ArrayList<>(
				Arrays.asList("1000", "2000", "3000", "", "4000", "", "5000", "6000", "", "7000", "8000", "9000", "",
							  "10000")));
		assertEquals((7000 + 8000 + 9000), solution.part1());
	}

	@Test
	void part1_TC2() {
		IO.getInstance().concatToFile(INPUT_FILE, new ArrayList<>(
				Arrays.asList("", "10000", "20000", "5000", "", "4000", "", "5000", "6000", "", "7000", "8000", "9000",
							  "", "10000")));
		assertEquals((10000 + 20000 + 5000), solution.part1());
	}

	@Test
	void part2() {
		assertEquals((45000), solution.part2());
	}

}
