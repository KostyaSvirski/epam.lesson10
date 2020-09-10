package by.svirski.lesson10.util.parser;

import java.util.List;

public abstract class AbstractParser<T> {
	
	protected static final String REGEXP_PARAGRAPH = "(\t){1,}.{1,}(\n){1,}";
	protected static final String REGEXP_PUNCT = "\\p{Punct}[^.!?]";
	protected static final String REGEXP_SENTENCES = "[.?!]";
	protected static final String REGEXP_CODEBLOCK = "(code start){1}.{0,}(code end){1}";
	protected static final String REGEXP_WORD = "\\w{1,}";
	
	public AbstractParser() {
		
	}
	
	protected abstract List<T> parse(String line);
	
}
