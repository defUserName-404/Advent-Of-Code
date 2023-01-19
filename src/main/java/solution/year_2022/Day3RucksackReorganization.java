package solution.year_2022;

import solution.Solution;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Day3RucksackReorganization extends Solution<Integer> {

	@Override
	public Integer part1() {
		return getInput()
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
							.orElse('\0');
				})
				.mapToInt(this::calculatePriority)
				.sum();
	}

	private int calculatePriority(char character) {
		return character >= 'a' && character <= 'z' ? character - 'a' + 1 : character - 'A' + 27;
	}

	@Override
	public Integer part2() {
		return IntStream
				.range(0, getInput().size())
				.boxed()
				.collect(Collectors.groupingBy(index -> index / 3))
				.values()
				.stream()
				.map(indices -> indices
						.stream()
						.map(getInput()::get)
						.collect(Collectors.joining("\n")))
				.mapToInt(group -> {
					char commonCharacter = group
							.chars()
							.mapToObj(c -> (char) c)
							.distinct()
							.filter(c -> group
									.lines()
									.allMatch(line -> line.contains(String.valueOf(c))))
							.findFirst()
							.orElse('\0');
					return calculatePriority(commonCharacter);
				})
				.sum();

	}

}
