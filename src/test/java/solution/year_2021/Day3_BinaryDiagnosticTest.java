package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day3_BinaryDiagnosticTest {

	private final Day3_BinaryDiagnostic day3Solution;

	Day3_BinaryDiagnosticTest() {
		this.day3Solution = new Day3_BinaryDiagnostic();
	}

	@Test
	void part1() {
		int ans = day3Solution.part1();
		Assertions.assertEquals(ans, 198);
	}

}
