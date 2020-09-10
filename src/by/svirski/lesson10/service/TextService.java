package by.svirski.lesson10.service;

import java.util.List;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.service.exception.ServiceException;

public interface TextService {
	
	List<? extends TextItem> executeTask(String parameters) throws ServiceException;
}
