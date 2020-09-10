package by.svirski.lesson10.service.impl;

import java.util.List;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.reader.CustomReader;
import by.svirski.lesson10.reader.factory.DaoFactory;
import by.svirski.lesson10.service.TextService;
import by.svirski.lesson10.service.exception.ServiceException;

public class FourthTaskServiceImpl implements TextService {

	public FourthTaskServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<? extends TextItem> executeTask(String parameters) throws ServiceException {
		if(parameters.length() > 0 && parameters.length() < 2) {
			List<? extends TextItem> resultList = null;
			try {
				int lengthOfString = Integer.parseInt(parameters);
				DaoFactory factory = DaoFactory.getInstance();
				CustomReader dao = factory.getDao();
				resultList = dao.find(lengthOfString);
			}
			catch(Exception e) {
				throw new ServiceException("error in parsing " + parameters);
			}
			return resultList;
		} else {
			throw new ServiceException("error in count of parameters");			
		}
	}

}
