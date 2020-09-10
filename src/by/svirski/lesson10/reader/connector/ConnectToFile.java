package by.svirski.lesson10.reader.connector;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class ConnectToFile {
	
	private static final String BASENAME = "property\\sourse";
	private static final String FILE_PATH = "sourse.path";

	public ConnectToFile() {
	}

	public static Path connectToTextFile() {
		ResourceBundle rb = ResourceBundle.getBundle(BASENAME);		
		String pathToFileStr = rb.getString(FILE_PATH);
		Path pathToFile = Paths.get(pathToFileStr);
		return pathToFile;
	}
}
