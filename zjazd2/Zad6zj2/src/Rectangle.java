/*SUMMARY: "Utworz kalse reprezentujaca prostokat, musi posiadac atrybuty dlugosc i szerokosc."
 * Klasa powinna posiadac metody obliczajace pole obwod i dlugosc przekatnej
 *AUTHOR: Joanna Walkiewicz*/
public class Rectangle { 
	double Height;
	double Width;

	double area() 
		{
			return this.Height * this.Width; 
		}
	double perimeter()
	{
			return 2*this.Height+2*this.Width;
	}
	double diagonal()
	{
		return Math.sqrt(this.Height*this.Height+this.Width*this.Width);
	}
}
