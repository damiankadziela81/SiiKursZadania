package sii.dp.abstractfactory;

public class MobileApplication {

	private Button button;
	private Checkbox checkbox;

	public MobileApplication(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void print() {
		button.printValue();
		checkbox.showPopup();
	}

}
