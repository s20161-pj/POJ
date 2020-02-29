/* 
 * SUMMARY: Kalkulator dziennego zapotrzebowania na kalorie."
 * AUTHOR: "Joanna Walkiewicz"	
*/

import java.util.Scanner;

public class Main {

	static double obliczWHIBk(double masa, double wzrost, double lata)
	{
		double WHIBk = 655.1 + (9.567 * masa) + (1.85 * wzrost) - (4.68 * lata);

		return WHIBk;
	}

	static double obliczWHIBm(double masa, double wzrost, double lata)
	{
		double WHIBm = 66.47 + 13.7 * masa + 5.0 * wzrost - 6.76 * lata;

		return WHIBm;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Podaj swoja mase [kg]:" + " ");
		double masa = scan.nextDouble();

		System.out.print("Podaj sw�j wzrost [cm]:" + " ");
		double wzrost = scan.nextDouble();

		System.out.print("Podaj sw�j wiek [lata]:" + " ");
		double lata = scan.nextDouble();

		System.out.println(
				"masa: " + masa + " " + "kg, " + "wzrost: " + wzrost + " cm," + " " + "wiek: " + lata + " lat");
		System.out.print("Podaj swoja plec: " + " ");
		String plec = scan1.nextLine();

		if (plec.equals("kobieta")) {

			double WHIBk = obliczWHIBk(masa, wzrost, lata);
			System.out.println("Podstawowe zapotrzebowanie organizmu na energi�: " + WHIBk + " " + "kcal");
		}
		
		if (plec.equals("mezczyzna")) {

			double WHIBm = obliczWHIBm(masa, wzrost, lata);
			System.out.println("Podstawowe zapotrzebowanie organizmu na energi�: " + WHIBm + " " + "kcal");
		}
	}

}
