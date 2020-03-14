
public class Cesar {
    private String szyfr;

    public void Szyfruj(String tekst, Integer przesuniecie){
        this.szyfr = "";
        char[] do_szyfru = tekst.toCharArray();
        
        for(int i=0; i<do_szyfru.length; i++)
        {       
            if(do_szyfru[i] == ' ') {
            	this.szyfr += ' ';
            } else {
            	char przesunieta = do_szyfru[i] += przesuniecie;
            	this.szyfr += przesunieta;
            }
            
        }
    }

    public void WyswietlOdszyfrowana(Integer przesuniecie){
        char[] do_odszyfr = this.szyfr.toCharArray();
        String wiadomosc = "";
        for(int i=0; i<do_odszyfr.length; i++)
        {
        	if(do_odszyfr[i] == ' ') {
        		wiadomosc += ' ';
            } else {
            	char przesunieta = do_odszyfr[i] -= przesuniecie;
            	wiadomosc += przesunieta;
            }
        }
        System.out.println(wiadomosc);
    }

    public String getMessage(){
        return this.szyfr;
    }

    public void printMessage(){
        if(!(this.szyfr.equals(""))){
            System.out.println(this.szyfr);
        }
        else
        {
            System.out.println("Nie zaszyfrowano jeszcze wiadomoœci");
        }
    }

}
