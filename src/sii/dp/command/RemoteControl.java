package sii.dp.command;

public class RemoteControl {
	
	private Commander command;
	
	public void setCommand(Commander command) {
		this.command = command;
	}

	public String exe() {
		return command.execute();
	}
}
