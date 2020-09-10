package by.svirski.lesson10.service.factory;

import by.svirski.lesson10.service.impl.FirstTaskServiceIImpl;
import by.svirski.lesson10.service.impl.FourthTaskServiceImpl;
import by.svirski.lesson10.service.impl.SecondTaskServiceImpl;

public class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private final FirstTaskServiceIImpl firstTaskServiceIImpl = new FirstTaskServiceIImpl();
	private final FourthTaskServiceImpl fourthTaskServiceImpl = new FourthTaskServiceImpl();
	private final SecondTaskServiceImpl secondTaskServiceImpl = new SecondTaskServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public FirstTaskServiceIImpl getFirstTaskServiceIImpl() {
		return firstTaskServiceIImpl;
	}

	public FourthTaskServiceImpl getFourthTaskServiceImpl() {
		return fourthTaskServiceImpl;
	}

	public SecondTaskServiceImpl getSecondTaskServiceImpl() {
		return secondTaskServiceImpl;
	}

	
}
