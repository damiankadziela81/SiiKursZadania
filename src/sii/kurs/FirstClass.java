package sii.kurs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class FirstClass {

	public static void main(String[] args) throws IOException {

		// showTemperatureMessage(23);
		// zadanie12(args);
		// zadanie15();
		// writeFile("mojPlikZDanymi.txt", "blablabla");
		// addDouble();
		zadanie30();

	}

	public static void zadanie0() {
		byte x = 127;
		x++;
		System.out.println(x);
		int y = Integer.MAX_VALUE + 1;
		System.out.println(y);
	}

	public static void zadanie1() {
		double kwota = 2.9f;
		System.out.println(kwota);
		int mojaWyplata = (int) kwota;
		System.out.println(mojaWyplata);
	}

	public static void zadanie2() {
		String kwota = "2";
		int mojaWyplata = Integer.parseInt(kwota);
		System.out.println(mojaWyplata);
	}

	public static void zadanie3() {
		char mojaZmienna = 'ą';
		System.out.println((int) mojaZmienna);
	}

	public static void zadanie4() {
		String imie = "Robert";
		{
			int mojaZmienna = 2;
		}
		{
			imie = "Ala";
		}
		// System.out.println(mojaZmienna);
		System.out.println(imie);
	}

	// 75 tablice
	public static void zadanie5() {
		int[] mojaTablica = { 1, 2 };
		int mojaZmienna = mojaTablica[0];
		mojaZmienna = mojaTablica[1];
		System.out.println(mojaZmienna);
	}

	// petle
	public static void zadanie6() {
		int x = 1;
		do {
			System.out.println("Petla " + x);
			x++;
		} while (x < 0);
	}

	// for each
	public static void zadanie7() {
		int myTab[] = { 12, 13, 14, 55 };
		for (int element : myTab) {
			System.out.println(element);
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < myTab.length; i++) {
			System.out.print(myTab[i] + " ");
		}
	}

	// 94 if
	public static void zadanie8() {
		boolean czyPadaDeszcz = false;
		boolean czySwieciSlonce = true;
		if (czyPadaDeszcz) {
			System.out.println("Wez parasol!!! ");
		} else if (czySwieciSlonce) {
			System.out.println("Wez okulary przeciwsloneczne");
		} else {
			System.out.println("Nie musisz brac parasola.");
		}
	}

	// elvis operator
	public static void zadanie9() {
		// warunek ? jeśli tak : jeśli nie
	}

	// continue/break
	public static void zadanie10() {
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	// switch
	static void showTemperatureMessage(int temperaturaPowietrza) {
		switch (temperaturaPowietrza) {
		case 23:
			System.out.println("Temperatura 23");
			break;
		case 24:
			System.out.println("Temperatura 24");
			break;
		case 25:
			System.out.println("Temperatura 25");
			break;
		default:
			System.out.println("Chyba zostaniesz w domu");
		}
	}

	public static int addTwoInts(int num1, int num2) {
		return num1 + num2;
	}

	// run -> run configurations... -> Arguments
	private static void zadanie12(String[] args) {
		System.out.println("Czesc jestem " + args[0] + " i nie pije od " + args[1] + " tygodni.");

	}

	// Scanner
	public static void zadanie13() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imie:");
		String imie = scanner.nextLine();
		System.out.println("Czesc jestem " + imie);

		System.out.println("Podaj wiek: ");
		int wiek = scanner.nextInt();
		System.out.println("Mam " + wiek + " lat.");
		scanner.close();
	}

	// try catch
	public static void zadanie14() {
		int myTab[] = new int[2];

		try {
			System.out.println("Co jest pod indexem 3: " + myTab[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ej, nie ma takiego indexu");
			return;
		} finally {
			System.out.println("Zawartosc indexu 0: " + myTab[0]);
		}
		System.out.println("Tego nie wyswietli gdy jest return w catchu.");
	}

	// File
	public static void zadanie15() {

		try {
			File file = new File("./src/names.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Brak pliku");
		} finally {
			// scanner.close();
		}
	}

	// zapisywanie do pliku
	public static void writeFile(String filename, String text) throws IOException {
		File file = new File(filename);
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		out.write(text);
		out.close();
	}

	// niedikładność float / double
	public static void addDouble() {
		double value = 0.0d;
		for (int i = 0; i < 10; i++) {
			value += 0.1d;
			System.out.println(value);
		}
	}

	// weekend 2
	// ----------------------------------------------------------------------
	// wrapper class
	private static void zadanie20() {
		String strNumber = "23";
		Integer intNumber = Integer.valueOf(strNumber);
		System.out.println(intNumber);
		double dobNumber = intNumber.doubleValue();
		System.out.println(dobNumber);
	}

	// tworzenie kolekcji
	private static void zadanie21() {
		List<String> names1 = Arrays.asList("ala", "ola");
		List<String> names2 = List.of("ala", "ola");

		names1.forEach(System.out::println);
		names2.forEach(System.out::println);
	}

	// Arrays
	private static void zadanie22() {

		int array1[] = { 5, 10, 15, 20, 25 };
		int array2[] = { 5, 10, 15, 20, 100 };

		int idx = Arrays.mismatch(array1, array2);

		System.out.println("Różnica w tablicach zaczyna się od indeksu: " + idx);
	}
	
	//zwraca 0 - równe, -1 w array1 pierwsza róznica jest mniejsza niz w array2
	//1 - w array 1 pierwsza roznica jest wieksza niz w array 2
	private static void zadanie23() {
		int array1[] = { 5, 10, 15, 25};
		int array2[] = { 5, 10, 15, 20};
		System.out.println(Arrays.compare(array1, array2));
	}
	
	//String
	private static void zadanie24() {

		String name1 = "Ala";
		String name2 = "Ala";
		String name3 = new String("Ala");
		
		//porownuje referencje
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		System.out.println();
		//porownuje wartosc
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
	}
	
	//StringBuilder
	private static void zadanie25() {

		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append(4 + " ");
		sb.append("World");
		
		System.out.println(sb.toString());
	}
	
	//concat - kazdy concat tworzy nowy obiekt!
	private static void zadanie26() {

		String s = "Hello"
				.concat(" ")
				.concat("in")
				.concat(" ")
				.concat("Java")
				.concat(" ")
				.concat("World");
		System.out.println(s);
	}
	
	//StringBuilder - substring
	private static void zadanie27() {
		String s = "Hello World";
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 8));
	}
	
	//odwracanie stringa
	private static void zadanie28() {
		StringBuilder s = new StringBuilder( "Hello World");
		System.out.println(s.reverse());
	}
	
	//odwracanie stringa - stringbuffer - zabezpieczony przed wielowątkowośćią!
	private static void zadanie29() {
		StringBuffer s = new StringBuffer( "Hello World");
		System.out.println(s.reverse());
	}
	
	//wypisac 100x bez uzywania petli
	private static void zadanie30() {
		String rep = "*";
		System.out.println(rep);
		rep = rep.replace("*", "**********");
		System.out.println(rep);
		rep = rep.replace("*", "**********");
		System.out.println(rep);
		rep = rep.replace("*", "\tAla ma kota\n");
		System.out.println(rep);
	}
	
	//
	private static void zadanie31() {
		
	}
	
	
}
