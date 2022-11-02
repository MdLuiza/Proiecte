
package proiect1;

public class Tranzitie {
    private String st_inceput;
    private char simbol;
    private String st_sfarsit;
    public Tranzitie(String st_inceput,char simbol,String st_sfarsit){
        this.st_inceput =st_inceput;
        this.simbol=simbol;
        this.st_sfarsit=st_sfarsit;
    }
    public String spuneStInceput(){return this.st_inceput;}
    public char spuneSimbol(){return this.simbol;}
    public String spuneStSfarsit(){return this.st_sfarsit;}

    public String toString() {
        return "(" + this.st_inceput + "," + this.simbol + "," + this.st_sfarsit + ")";
    }
    
}
