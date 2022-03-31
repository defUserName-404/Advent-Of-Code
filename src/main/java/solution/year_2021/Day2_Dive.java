package solution.year_2021;

import util.IO;

import java.util.ArrayList;

public class Day2_Dive {
	public static int part1() {
		ArrayList<String> input = IO.getInstance().readFile();
		int x = 0, y = 0;

		for (final String currentCommand : input) {
			String[] parts = currentCommand.split(" ");
			String command = parts[0];
			int value = Integer.parseInt(parts[1]);

			switch (command) {
				case "forward" -> x += value;
				case "up" -> y += value;
				case "down" -> y -= value;
			}
		}
		int multiplicationResult = x * -y;
		IO.getInstance().writeToFile(String.valueOf(multiplicationResult));
		return multiplicationResult;
	}
}