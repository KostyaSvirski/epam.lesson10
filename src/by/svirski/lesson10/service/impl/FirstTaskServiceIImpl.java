package by.svirski.lesson10.service.impl;

import java.util.List;

import by.svirski.lesson10.bean.SentenceItem;
import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.reader.CustomReader;
import by.svirski.lesson10.reader.exception.DaoException;
import by.svirski.lesson10.reader.factory.DaoFactory;
import by.svirski.lesson10.service.TextService;
import by.svirski.lesson10.service.exception.ServiceException;

public class FirstTaskServiceIImpl implements TextService {

	public FirstTaskServiceIImpl() {
	}

	@Override
	public List<? extends TextItem> executeTask(String parameters) throws ServiceException {
		if(parameters.length() == 0) {
			DaoFactory factory = DaoFactory.getInstance();
			CustomReader dao = factory.getDao();
			List<SentenceItem> resultList;
			try {
				resultList = dao.read();
				return resultList;
			} catch (DaoException e) {
				throw new ServiceException(e);
			}
		} else {
			throw new ServiceException("error in count of parameters");
		}
	}

}
