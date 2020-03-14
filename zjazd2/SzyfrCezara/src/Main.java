/*AUTHOR: Joanna Walkiewicz
 * SUMMARY: Szyfr Cezara"
 */
public class Main {

    public static void main(String[] args) {
        Cesar wiadomosc = new Cesar();
        wiadomosc.Szyfruj("JOANNA WALKIEWICZ",3);
        wiadomosc.printMessage();
        wiadomosc.WyswietlOdszyfrowana(3);
    }
}

