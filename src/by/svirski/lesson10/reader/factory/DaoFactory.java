package by.svirski.lesson10.reader.factory;

import by.svirski.lesson10.reader.impl.CustomReaderImpl;

public class DaoFactory {

	private static final DaoFactory instance = new DaoFactory();
	
	private final CustomReaderImpl dao = new CustomReaderImpl();
	
	private DaoFactory() {
	}

	public static DaoFactory getInstance() {
		return instance;
	}

	public CustomReaderImpl getDao() {
		return dao;
	}
	
	
}
