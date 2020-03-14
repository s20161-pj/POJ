/*SUMMARY: "Utworz kalse reprezentujaca prostokat, musi posiadac atrybuty dlugosc i szerokosc."
 * Klasa powinna posiadac metody obliczajace pole obwod i dlugosc przekatnej
 AUTHOR: Joanna Walkiewicz*/
public class Main {

	public static void main(String[] args) {
		
		Rectangle MyRectangle = new Rectangle(); //tworzymy obiekt
		MyRectangle.Height = 5;  //ustawiam wartosci atrybutow
		MyRectangle.Width=10;
		
		double a = MyRectangle.area(); //tworzymy zmienna i przypisujemy jej wartosc wywolanej metody //przez kropke odnosimy sie do metod i atrybutow
		System.out.println(a);
		double p = MyRectangle.perimeter();
		System.out.println(p);
		double d = MyRectangle.diagonal();
		System.out.println(d);
		}
		
	}


