
/*
 * SUMMARY: "Program do obliczenia BMI"
 * AUTHOR: "Joanna Walkiewicz"
 * 
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Podaj swój wzrost:" + " ");
		double wzrost = scan.nextDouble();	
		System.out.println("Wzrost: " + wzrost);
		
		System.out.print("Podaj swoj¹ wagê:" + " ");
		double waga = scan.nextDouble();
		System.out.println("Waga: " + waga);
		
		double BMI = waga / (wzrost/100 * wzrost/100);
		System.out.println("BMI wynosi: " + BMI);
		
		if (BMI < 18.5)
		{
			System.out.println("Niedowaga");
		}
		else if (BMI>=18.5 & BMI<=24.9 )
		{
			System.out.println("Norma");
		}
		else if (BMI>=25 & BMI<=29.9)
		{
			System.out.println("Nadwaga");
		}
		else 
		{
			System.out.println("Nadwaga");	
		}
	}

}
