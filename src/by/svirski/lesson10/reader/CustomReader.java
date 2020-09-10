package by.svirski.lesson10.reader;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.reader.exception.DaoException;

public interface CustomReader {

	TextItem read() throws DaoException;

}
