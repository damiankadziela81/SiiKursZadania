package sii.dp.abstractfactory;

public class AndroidFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new AndroidCheckbox();
	}

}
