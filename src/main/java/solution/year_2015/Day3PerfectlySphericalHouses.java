package solution.year_2015;

import solution.Solution;
import util.Pair;

import java.util.HashMap;

public final class Day3PerfectlySphericalHouses extends Solution<Integer> {

	private static final HashMap<Pair<Integer,Integer>,Integer> houses = new HashMap<>();

	@Override
	public Integer part1() {
		int x = 0, y = 0;
		mapCoordinates(x, y);
		for (final String current : getInput()) {
			for (final char currentChar : current.toCharArray()) {
				int[] coordinatesAfterMoveMade = coordinatesAfterMove(x, y, currentChar);
				x = coordinatesAfterMoveMade[0];
				y = coordinatesAfterMoveMade[1];
				mapCoordinates(x, y);
			}
		}
		int ans = houses.size();
		displayOutput(String.valueOf(ans));
		return ans;
	}

	private static void mapCoordinates(int x, int y) {
		Pair<Integer,Integer> coordinate = new Pair<>(x, y);
		houses.merge(coordinate, 1, Integer::sum);
	}

	private static int[] coordinatesAfterMove(int x, int y, char currentChar) {
		switch (currentChar) {
			case '>' -> x++;
			case '<' -> x--;
			case 'v' -> y--;
			case '^' -> y++;
		}
		return new int[] {x, y};
	}

	@Override
	public Integer part2() {
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		mapCoordinates(x1, y1);
		for (final String current : getInput()) {
			for (int i = 0; i < current.length(); i++) {
				char currentChar = current.charAt(i);
				if (i % 2 == 0) {
					int[] coordinatesAfterMoveMade = coordinatesAfterMove(x1, y1, currentChar);
					x1 = coordinatesAfterMoveMade[0];
					y1 = coordinatesAfterMoveMade[1];
					mapCoordinates(x1, y1);
				}
				else {
					int[] coordinatesAfterMoveMade = coordinatesAfterMove(x2, y2, currentChar);
					x2 = coordinatesAfterMoveMade[0];
					y2 = coordinatesAfterMoveMade[1];
					mapCoordinates(x2, y2);
				}
			}
		}
		int ans = houses.size();
		displayOutput(String.valueOf(ans));
		return ans;
	}

}
