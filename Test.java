
package proiect1;

public class Test {
    public static void main(String[] args) throws Exception{
        Automat M =new Automat("C:\\Users\\madal\\OneDrive\\Documente\\Visual Studio 2022\\Templates\\proiect1\\automat.txt");
        String sir="abbab";
        System.out.println("Sir de analizat: " + sir);
        System.out.println(M.analizeazaCuvant(sir));

        Tranzitie t1=new Tranzitie("q0",'a',"q1");
        Tranzitie t2=new Tranzitie("q1",'b',"q1");
        Tranzitie t3=new Tranzitie("q1",'a',"q2");
        Tranzitie t4=new Tranzitie("q2",'b',"q1");
        Tranzitie t5=new Tranzitie("q0",'b',"q2");

        Lista_Tranzitii lt = new Lista_Tranzitii();
        lt.adaugaTranzitie(t1);
        lt.adaugaTranzitie(t2);
        lt.adaugaTranzitie(t3);
        lt.adaugaTranzitie(t4);
        lt.adaugaTranzitie(t5);

        Automat dfa = new Automat(st_init, st_finale, lt);
            System.out.println(dfa.toString());
            
            System.out.println(dfa.analizeazaCuvant("aaababa"));
            
            lt.afiseazaLista();
    }
    
}
