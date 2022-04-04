package solution.year_2015;

import solution.Solution;
import util.Pair;

import java.util.HashMap;

public final class Day3_PerfectlySphericalHouses extends Solution {
	private static final HashMap<Pair<Integer, Integer>, Integer> houses = new HashMap<>();

	private static void mapCoordinates(int x, int y) {
		Pair<Integer, Integer> coordinate = new Pair<>(x, y);
		houses.merge(coordinate, 1, Integer::sum);
	}

	public static int part1() {
		int x = 0, y = 0;
		mapCoordinates(x, y);

		for (final String current : input) {
			for (final char currentChar : current.toCharArray()) {
				switch (currentChar) {
					case '>' -> x++;
					case '<' -> x--;
					case 'v' -> y--;
					case '^' -> y++;
				}

				mapCoordinates(x, y);
			}
		}

		int ans = houses.size();
		displayOutput(String.valueOf(ans));

		return ans;
	}
}