package by.svirski.lesson10.reader.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import by.svirski.lesson10.bean.CodeBlockItem;
import by.svirski.lesson10.bean.SentenceItem;
import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.reader.CustomReader;
import by.svirski.lesson10.reader.connector.ConnectToFile;
import by.svirski.lesson10.reader.exception.DaoException;
import by.svirski.lesson10.util.parser.impl.SentencesParser;

public class CustomReaderImpl implements CustomReader {

	public static final String START_OF_CODE = "(code start)";
	public static final String END_OF_CODE = "(code end)";
	private final Path pathToFile;

	public CustomReaderImpl() {
		pathToFile = ConnectToFile.connectToTextFile();
	}

	@Override
	public TextItem read() throws DaoException {
		try {
			List<String> listOfLines = Files.readAllLines(pathToFile);
			List<TextItem> resultTextList = new ArrayList<TextItem>();
			List<String> resultCodeBlockList = null;
			boolean flag = false;
			for (String line : listOfLines) {
				if (line.contains(START_OF_CODE)) {
					flag = true;
					resultCodeBlockList = new ArrayList<String>();
				}
				if (!line.contains(END_OF_CODE) && flag) {
					resultCodeBlockList.add(line);
				}
				if (line.contains(END_OF_CODE)) {
					flag = false;
					CodeBlockItem codeBlockItem = new CodeBlockItem(resultCodeBlockList);
					resultTextList.add(codeBlockItem);
					continue;
				}
				if(!flag) {
					SentencesParser parser = new SentencesParser();
					List<SentenceItem> sentences = parser.parse(line);
					for(SentenceItem sentence : sentences) {
						resultTextList.add(sentence);
					}
				}	
			}
			TextItem textItem = new TextItem(resultTextList);
			return textItem;
		} catch (IOException e) {
			throw new DaoException("file not found");
		}

	}

}
