package solution;

import util.IO;

import java.io.File;
import java.util.List;

public abstract class Solution <T> {

	public static final File INPUT_FILE = new File("src/main/resources/io/input.txt");
	public static final File OUTPUT_FILE = new File("src/main/resources/io/output.txt");

	protected static List<String> getInput() {
		return IO.getInstance().readFile(INPUT_FILE);
	}

	protected static void displayOutput(String output) {
		IO.getInstance().writeToFile(OUTPUT_FILE, output);
	}

	public abstract T part1();

	public abstract T part2();

}
