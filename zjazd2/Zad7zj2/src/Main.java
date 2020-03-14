import java.util.Scanner;

/*SUMMARY: "Stwórz klasę reprezentującą trójkąt, który musi posiadać atrybuty określające długości boków. 
			Klasa powinna posiadada metody: obliczające pole, obwód,  isEquilateral, isIsosceles, or isScalene.
  AUTHOR: Joanna Walkiewicz*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle myTriangle = new Triangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj a:");
		myTriangle.a = scanner.nextDouble();
		
		System.out.println("Podaj b:");
		myTriangle.b = scanner.nextDouble();
		
		System.out.println("Podaj c:");
		myTriangle.c = scanner.nextDouble();
		
		
		System.out.println("Pole to: ");
		System.out.print(myTriangle.area());
	}
}
