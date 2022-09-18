package sii.dp.abstractfactory;

public class Main {

	public static void main(String[] args) {
		MobileApplication app;
		GUIFactory factory;
		
		String osName = "mac";
		if (osName.equals("mac")) {
			factory = new IPhoneFactory();
			app = new MobileApplication(factory);
		} else {
			factory = new AndroidFactory();
			app = new MobileApplication(factory);
		}
		
		app.print();

	}

}
