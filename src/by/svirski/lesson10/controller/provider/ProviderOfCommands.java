package by.svirski.lesson10.controller.provider;

import by.svirski.lesson10.controller.command.AbstractCommand;
import by.svirski.lesson10.controller.command.CommandType;
import by.svirski.lesson10.controller.command.impl.IncorrectCommand;

public class ProviderOfCommands {

	public ProviderOfCommands() {

	}

	public static AbstractCommand findCommand(String typeOfCommand) {
		CommandType[] typesOfCommand = CommandType.values();
		for (CommandType commandToCheck : typesOfCommand) {
			if(commandToCheck.toString().equalsIgnoreCase(typeOfCommand)) {
				return commandToCheck.getCommand();
			}
		}
		return new IncorrectCommand();
	}

}
