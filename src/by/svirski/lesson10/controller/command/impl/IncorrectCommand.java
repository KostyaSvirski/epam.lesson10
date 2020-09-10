package by.svirski.lesson10.controller.command.impl;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.controller.command.AbstractCommand;

public class IncorrectCommand implements AbstractCommand {

	public IncorrectCommand() {
	}

	@Override
	public TextItem execute(String request) {
		
		return null;
	}

}
