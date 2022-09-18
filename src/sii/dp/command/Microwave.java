package sii.dp.command;

public class Microwave implements InternetOfThings {

	@Override
	public String setOn() {
		return "Microwave is on";
	}

	@Override
	public String setOff() {
		return "Microwave is off";
	}

}
