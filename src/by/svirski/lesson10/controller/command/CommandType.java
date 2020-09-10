package by.svirski.lesson10.controller.command;

import by.svirski.lesson10.controller.command.impl.*;

public enum CommandType {
	
	FIRT_TASK(new FirstTaskCommand()) {
		@Override
		public String toString() {
			return "first-task";
		}
	},
	FOURTH_TASK(new FourthTaskCommand()) {
		@Override
		public String toString() {
			return "fourth-task";
		}
	},
	SECOND_TASK(new SecondTaskCommand()) {
		@Override
		public String toString() {
			return "second-task";
		}
	};
	
	private final AbstractCommand command;

	private CommandType(AbstractCommand command) {
		this.command = command;
	}

	public AbstractCommand getCommand() {
		return command;
	}
	
	public abstract String toString();
}
