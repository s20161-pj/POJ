package piramida2;

/*
 * SUMMARY: "Piramida z literek"
 * AUTHOR: Joanna Walkiewicz
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Podaj rozmiar: ");
		int size = scan.nextInt();
		System.out.println("Wybrany rozmiar to: "+ size);
		
		char letter = 'a';
		int spaceSize = size -1;
		int letterCount = 1;   
		
		for(int a = 0 ; a < size ; a++) {
			for (int i=0 ; i < spaceSize ; i++) {
				System.out.print(" ");
			}
			
			for(int i = 0; i< letterCount; i++) {
				System.out.print(letter);
				if(i < a) {
					letter++;
				} else {
					letter--;
				}
			}
			letter = 'a';
			spaceSize--;
			letterCount = letterCount + 2;
			System.out.println();
		}
	}

}
