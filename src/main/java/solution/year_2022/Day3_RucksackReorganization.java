package solution.year_2022;

import solution.Solution;

import java.util.List;

public class Day3_RucksackReorganization extends Solution<Integer> {

	@Override
	public Integer part1() {
		List<String> rucksacks = getInput();
		return rucksacks
				.stream()
				.map(rucksack -> {
					int halfLength = rucksack.length() / 2;
					String firstCompartment = rucksack.substring(0, halfLength);
					String secondCompartment = rucksack.substring(halfLength);
					return firstCompartment
							.chars()
							.mapToObj(c1 -> (char) c1)
							.filter(c1 -> secondCompartment
									.chars()
									.mapToObj(c2 -> (char) c2)
									.anyMatch(c2 -> c1 == c2))
							.findFirst()
							.orElse('*');
				})
				.mapToInt(common -> (common >= 'a' && common <= 'z') ? common - 'a' + 1 : common - 'A' + 27)
				.sum();
	}

	@Override
	public Integer part2() {
		return null;
	}

}
