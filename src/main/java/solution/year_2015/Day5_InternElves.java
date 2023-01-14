package solution.year_2015;

import solution.Solution;

public class Day5_InternElves extends Solution<Integer> {

	@Override
	public Integer part1() {
		int count = 0;
		for (final String current : getInput()) {
			if (isNice(current)) {
				count++;
			}
		}
		displayOutput(String.valueOf(count));
		return count;
	}

	private static boolean isNice(String string) {
		int vowelCount = 0;
		boolean twiceInRow = false;
		boolean containsNaughtyString = false;
		int n = string.length();
		for (int i = 0; i < n - 1; i++) {
			char currentCharacter = string.charAt(i);
			char nextCharacter = string.charAt(i + 1);
			if (isVowel(currentCharacter)) {
				vowelCount++;
			}
			if (currentCharacter == nextCharacter) {
				twiceInRow = true;
			}
			if (doesContainNaughtyString(currentCharacter, nextCharacter)) {
				containsNaughtyString = true;
			}
			if ((i == n - 2) && isVowel(nextCharacter)) {
				vowelCount++;
			}
		}
		return (vowelCount > 2 && twiceInRow && !containsNaughtyString);
	}

	private static boolean isVowel(char currentCharacter) {
		return (currentCharacter == 'a' ||
				currentCharacter == 'e' ||
				currentCharacter == 'i' ||
				currentCharacter == 'o' ||
				currentCharacter == 'u');
	}

	private static boolean doesContainNaughtyString(char currentCharacter, char nextCharacter) {
		return ((currentCharacter == 'a' && nextCharacter == 'b') ||
				(currentCharacter == 'c' && nextCharacter == 'd') ||
				(currentCharacter == 'p' && nextCharacter == 'q' || (currentCharacter == 'x' && nextCharacter == 'y')));
	}

	@Override
	public Integer part2() {
		return null;
	}

}
