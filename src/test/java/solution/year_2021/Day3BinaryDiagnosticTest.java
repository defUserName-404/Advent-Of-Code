package solution.year_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3BinaryDiagnosticTest {

	private final Day3BinaryDiagnostic day3Solution;

	Day3BinaryDiagnosticTest() {
		this.day3Solution = new Day3BinaryDiagnostic();
	}

	@Test
	void part1() {
		int ans = day3Solution.part1();
		Assertions.assertEquals(ans, 198);
	}

}
