package solution;

import util.IO;

import java.util.ArrayList;

public class Solution {
	protected static final ArrayList<String> input = IO.getInstance().readInputFile();

	protected static void displayOutput(String output) {
		IO.getInstance().writeToOutputFile(String.valueOf(output));
	}
}