package sii.dp.singleton;

public class Single {
	//prywatny konstruktor
	private Single() {}
	
	private static class PrepareSingle {
		static final Single INSTANCE = new Single();
	}
	
	public static Single getInstacne() {
		return PrepareSingle.INSTANCE;
	}
	
	public String getSillyText() {
		return "Silly text";
	}
}
