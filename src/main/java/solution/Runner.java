package util;

import solution.Solution;
import solution.year_2022.Day1_CalorieCounting;

public class Runner {

	public static void main(String[] args) {
		Solution<Long> solution = new Day1_CalorieCounting();
		long ans = solution.part1();
		System.out.println(ans);
	}
	
}