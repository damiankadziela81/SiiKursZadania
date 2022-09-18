package sii.dp.command;

public class MachineOnSwitcher implements Commander{
	
	private InternetOfThings internetOfThings;
	
	public MachineOnSwitcher(InternetOfThings internetOfThings) {
		this.internetOfThings = internetOfThings;
	}

	@Override
	public String execute() {
		return internetOfThings.setOn();
	}

}
