package by.svirski.lesson10.controller.invoker;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.controller.command.AbstractCommand;
import by.svirski.lesson10.controller.command.exception.CommandException;
import by.svirski.lesson10.controller.provider.ProviderOfCommands;

public class CustomInvoker {

	private static final CustomInvoker instance = new CustomInvoker();
	
	private CustomInvoker() {
	}
	
	public TextItem invoke(String request) {
		String[] parsedCommand = request.split(" ", 2);
		AbstractCommand command = ProviderOfCommands.findCommand(parsedCommand[0]);
		TextItem result = null;
		try {
			result = command.execute(parsedCommand[1]);
		} catch (CommandException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static CustomInvoker getInstance() {
		return instance;
	}
	
}
