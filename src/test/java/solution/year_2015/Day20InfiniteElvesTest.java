package solution.year_2015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution;
import util.IO;

import static solution.Solution.INPUT_FILE;

public class Day20InfiniteElvesTest {

	private final Solution<Integer> solution;

	Day20InfiniteElvesTest() {
		this.solution = new Day20InfiniteElves();
	}

	@Test
	void part1_TC1() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "10");
		int ans = solution.part1();
		Assertions.assertEquals(1, ans);
	}

	@Test
	void part1_TC2() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "30");
		int ans = solution.part1();
		Assertions.assertEquals(2, ans);
	}

	@Test
	void part1_TC3() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "40");
		int ans = solution.part1();
		Assertions.assertEquals(3, ans);
	}

	@Test
	void part1_TC4() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "70");
		int ans = solution.part1();
		Assertions.assertEquals(4, ans);
	}

	@Test
	void part1_TC5() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "60");
		int ans = solution.part1();
		Assertions.assertEquals(5, ans);
	}

	@Test
	void part1_TC6() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "120");
		int ans = solution.part1();
		Assertions.assertEquals(6, ans);
	}

	@Test
	void part1_TC7() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "80");
		int ans = solution.part1();
		Assertions.assertEquals(7, ans);
	}

	@Test
	void part1_TC8() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "150");
		int ans = solution.part1();
		Assertions.assertEquals(8, ans);
	}

	@Test
	void part1_TC9() {
		IO
				.getInstance()
				.writeToFile(INPUT_FILE, "130");
		int ans = solution.part1();
		Assertions.assertEquals(9, ans);
	}

}
