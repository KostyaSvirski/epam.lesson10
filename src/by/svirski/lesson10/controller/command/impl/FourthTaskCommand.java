package by.svirski.lesson10.controller.command.impl;

import java.util.List;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.controller.command.AbstractCommand;
import by.svirski.lesson10.controller.command.exception.CommandException;
import by.svirski.lesson10.service.TextService;
import by.svirski.lesson10.service.exception.ServiceException;
import by.svirski.lesson10.service.factory.ServiceFactory;

public class FourthTaskCommand implements AbstractCommand {

	public FourthTaskCommand() {
	}

	@Override
	public TextItem execute(String request) throws CommandException {
		ServiceFactory factory = ServiceFactory.getInstance();
		TextService service = factory.getFourthTaskServiceImpl();
		try {
			List<? extends TextItem> result = service.executeTask(request);
			TextItem textItem = new TextItem(result);
			return textItem;
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
	}

}
