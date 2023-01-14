package solution.year_2022;

import solution.Solution;

import java.util.ArrayList;
import java.util.List;

public class Day1_CalorieCounting extends Solution<Long> {

	@Override
	public Long part1() {
		long max = Long.MIN_VALUE;
		long currentColorie = 0;
		for (final String colorie : getInput()) {
			if (colorie.isEmpty()) {
				currentColorie = 0;
				continue;
			}
			currentColorie += Long.parseLong(colorie);
			max = Math.max(max, currentColorie);
		}
		displayOutput(String.valueOf(max));
		return max;
	}

	@Override
	public Long part2() {
		long first, second, third;
		long currentColorie = 0;
		first = second = third = Long.MIN_VALUE;
		List<Long> caloriesCarriedByEachElf = new ArrayList<>();
		for (final String calorie : getInput()) {
			if (!calorie.isEmpty()) {
				currentColorie += Long.parseLong(calorie);
				continue;
			}
			caloriesCarriedByEachElf.add(currentColorie);
			currentColorie = 0;
		}
		caloriesCarriedByEachElf.add(Long.parseLong(getInput().get(getInput().size() - 1)));
		for (final long calorie : caloriesCarriedByEachElf) {
			if (calorie >= first) {
				third = second;
				second = first;
				first = calorie;
			}
			else if (calorie >= second) {
				third = second;
				second = calorie;
			}
			else if (calorie >= third) {
				third = calorie;
			}
		}
		Long calorieCarriedByTopThree = first + second + third;
		displayOutput(calorieCarriedByTopThree.toString());
		return calorieCarriedByTopThree;
	}

}
