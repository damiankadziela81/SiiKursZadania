package sii.dp.factory.figury;

public class FigureFactory {

	public Figure getFigure(int sides) {
		switch (sides) {
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		case 3:
			return new Triangle();
		default:
			return null;
		}
	}

}
