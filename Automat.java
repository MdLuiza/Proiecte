
package proiect1;
import java.io.*;

public class Automat {
    private String st_init;
    private String st_finale[];
    private Lista_Tranzitii lt =new Lista_Tranzitii();

    Automat(String st_init, String st_finale,Lista_Tranzitii lt){
        this.st_init = st_init;
        this.st_finale = st_finale;
        this.lt = lt;

    }  
    
    public Automat(String nume_fis) throws Exception{

        BufferedReader buf = new BufferedReader(new FileReader(nume_fis));
        this.st_init=buf.readLine();
        String st_finale_str = buf.readLine();
        this.st_finale =st_finale_str.split(" ");

        while(true){
            String linie = buf.readLine();
            if(linie == null)
                break;
            else{
                String sir_el[] =linie.split(" ");
                Tranzitie tr =new Tranzitie(sir_el[0],sir_el[1].charAt(0),sir_el[2]);
                this.lt.adaugaTranzitie(tr);
            }
        }
    }
    boolean analizeazaCuvant(String sir_intrare){return true;}

    public String toString() {
        String aut = "";
        aut += "Stare initiala: " + this.st_init+"\n";
        aut += "Stari finale: " + this.st_finale.toString()+"\n";
        aut += "Lista de tranzitii:\n" + this.lista.toString();
        return aut;
    }
}
