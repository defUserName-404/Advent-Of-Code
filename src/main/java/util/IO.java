package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO {

	private static IO instance;

	private IO() {
	}

	public static IO getInstance() {
		if (instance == null)
			instance = new IO();
		return instance;
	}

	public List<String> readFile(File file) {
		List<String> inputData = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null)
				inputData.add(line);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputData;
	}

	public void writeToFile(File file, String string) {
		try {
			Writer writer = new BufferedWriter(new FileWriter(file));
			writer.write(string);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void concatToFile(File file, List<String> stringsToBeConcatenated) {
		List<String> stringsAlreadyIncluded = readFile(file);
		try {
			Writer writer = new BufferedWriter(new FileWriter(file));
			for (String string : stringsAlreadyIncluded)
				writer.write(string + "\n");
			for (String string : stringsToBeConcatenated)
				writer.write(string + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}