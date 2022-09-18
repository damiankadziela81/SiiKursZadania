package sii.dp.command;

public class Fridge implements InternetOfThings {

	@Override
	public String setOn() {
		return "Fridge is on";
	}

	@Override
	public String setOff() {
		return "Fridge is off";
	}

}
