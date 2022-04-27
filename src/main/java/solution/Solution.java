package solution;

import util.IO;

import java.util.ArrayList;

public abstract class Solution<T> {
	protected static final ArrayList<String> input = IO.getInstance().readInputFile();

	protected static void displayOutput(String output) {
		IO.getInstance().writeToOutputFile(String.valueOf(output));
	}

	protected abstract T part1();

	protected abstract T part2();
}