package util;

import java.io.*;
import java.util.ArrayList;

public class IO {
	private static IO instance;
	private static final File INPUT_FILE = new File("src/main/resources/io/input.txt");
	private static final File OUTPUT_FILE = new File("src/main/resources/io/output.txt");

	private IO() {
	}

	public static IO getInstance() {
		if (instance == null)
			instance = new IO();
		return instance;
	}

	public ArrayList<String> readInputFile() {
		ArrayList<String> inputData = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
			String line;
			while ((line = reader.readLine()) != null)
				inputData.add(line);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputData;
	}

	public void writeToOutputFile(String string) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));
			writer.write(string);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeToFile(File file, String string) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(string);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}