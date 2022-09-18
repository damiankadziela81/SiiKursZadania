package sii.lambda;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		Calculating dodawanie = new Calculating() {
			@Override
			public int count(int a, int b) {
				return a + b;
			}
		};

		Calculating odejmowanie = new Calculating() {
			@Override
			public int count(int c, int d) {
				return c - d;
			}
		};
		
		Calculating dodawanieLambda = (a, b) -> a + b;
		Calculating odejmowanieLambda = (c, d) -> c - d;
		
		System.out.println(dodawanie.count(2, 3));
		System.out.println(odejmowanie.count(2, 3));
		System.out.println("----------------Lambda--------------------");
		System.out.println(dodawanieLambda.count(2, 3));
		System.out.println(odejmowanieLambda.count(2, 3));
		System.out.println("----------------BiFunction----------------");
		
		BiFunction<Integer,Integer,Integer> biDodawanie = (a, b) -> a + b;
		
		BiFunction<Integer,Integer,Double> biDodawanie1 = (a, b) -> Double.valueOf(a + b);
		
		System.out.println(biDodawanie.apply(2, 3));
		System.out.println(biDodawanie1.apply(2, 3));
		
		
	}

}
