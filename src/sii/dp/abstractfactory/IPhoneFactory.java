package sii.dp.abstractfactory;

public class IPhoneFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new IPhoneButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new IPhoneCheckbox();
	}

}
