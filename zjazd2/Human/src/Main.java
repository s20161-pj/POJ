/*Author: Joanna Walkiewicz
 * Summary:Utworz klase Human reprezentujaca czlowieka, musi posiadac atrybuty takie jak wiek, waga, wzrost, imie, plec, numer indeksu, rozmiar stopy...
 */

public class Main {

    public static void main(String[] args) {
	    Human Joanna = new Human("Joanna", "Walkiewicz");
	    Joanna.setAge(27);
	    Joanna.setHeight(175.0);
	    Joanna.setIndex("s20161");
	    Joanna.setWeight(60.0);
	    Joanna.setSex("K");
	    Joanna.setFeet(42);

	    String plec;
	    if(Joanna.isMale())
        {
            plec = "M";
        }
	    else
        {
            plec = "K";
        }

        System.out.println(Joanna.getFname() + " " + Joanna.getLname() + ", plec: " + plec + ", wiek: " + Joanna.getAge() + ", wzrost: " + Joanna.getHeight() + ", waga: " + Joanna.getWeight() + ", rozmiar buta: " + Joanna.getFeet() + ", nr indeksu: " + Joanna.getIndex());
    }
}
