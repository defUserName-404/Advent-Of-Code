package solution.year_2022;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solution.Solution;
import util.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static solution.Solution.INPUT_FILE;

public class Day3RucksackReorganizationTest {

	private static Solution<Integer> solution;

	@BeforeAll
	static void setup() {
		solution = new Day3RucksackReorganization();
	}

	@BeforeEach
	void setUp() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "");
	}

	@Test
	void part1() {
		IO
				.getInstance()
				.concatToFile(INPUT_FILE,
							  new ArrayList<>(List.of("vJrwpWtwJgWrhcsFMMfFFhFp",
													  "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
													  "PmmdzqPrVvPwwTWBwg",
													  "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
													  "ttgJtRGJQctTZtZT",
													  "CrZsJsPPZsGzwwsLwLmpwMDw")));
		assertEquals(157, solution.part1());
	}

	@Test
	void part2() {
		IO
				.getInstance()
				.concatToFile(INPUT_FILE,
							  new ArrayList<>(List.of("vJrwpWtwJgWrhcsFMMfFFhFp",
													  "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
													  "PmmdzqPrVvPwwTWBwg",
													  "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
													  "ttgJtRGJQctTZtZT",
													  "CrZsJsPPZsGzwwsLwLmpwMDw")));
		assertEquals(70, solution.part2());
	}

}
