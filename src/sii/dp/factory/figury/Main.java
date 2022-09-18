package sii.dp.factory.figury;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		FigureFactory figureFactory = new FigureFactory();
		BigDecimal[] numb = { BigDecimal.ONE };

		Figure figure = figureFactory.getFigure(numb.length);

		System.out.println("Obwód figury " + figure.toString() + " to: " + figure.getCircuit(numb));

	}

}
