package sii.dp.command;

public class MachineOffSwitcher implements Commander{
	
	private InternetOfThings internetOfThings;
	
	public MachineOffSwitcher(InternetOfThings internetOfThings) {
		this.internetOfThings = internetOfThings;
	}

	@Override
	public String execute() {
		return internetOfThings.setOff();
	}

}
