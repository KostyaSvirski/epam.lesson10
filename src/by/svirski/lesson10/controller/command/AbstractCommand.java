package by.svirski.lesson10.controller.command;

import by.svirski.lesson10.bean.TextItem;
import by.svirski.lesson10.controller.command.exception.CommandException;

public interface AbstractCommand {
	
	TextItem execute(String request) throws CommandException;
}
