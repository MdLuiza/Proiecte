
package proiect1;
import java.util.*;


public class Lista_Tranzitii {
    private ArrayList <Tranzitie> lista= new ArrayList<Tranzitie>();

    void adaugaTranzitie(Tranzitie tl){
        this.lista.add(tl);
    }

    Tranzitie spuneTranzitie(String stare,char simbol){
        for(int i=0;i<lista.size();i++){
            Tranzitie tmp=lista.get(i);
            if(tmp.spuneStInceput().equals(stare) && tmp.spuneSimbol()==simbol){
                return tmp;
            }
        }
        return null;
    }

    Tranzitie urmatoareaTranzitie(String stare,char simbol){
        for(int i=0;i<lista.size();i++){
            Tranzitie tmp=lista.get(i);
            if(tmp.spuneStInceput().equals(stare) && tmp.spuneSimbol()==simbol){
                return tmp.spuneSfarsit();
            }
        }
        return null;
    }

    public String toString() {
        String iesire = "";
        for(int i = 0; i < this.lista.size(); i++) {
            Tranzitie tmp = this.lista.get(i);
            iesire += tmp.spuneSfarsit() + " ";
        }
        return iesire;
    }
    
}
