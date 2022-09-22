import java.util.ArrayList;

public class java19arrayLIST {

    public static void main(String[] args) {

        ArrayList<String> persone = new ArrayList<String>();
        //con i numeri  ArrayList<integer> persone = new ArrayList<integer>();
        //quindi aggiungere i numeri alle persone esempio: persone.add(1);

        //aggiungiamo elementi
        persone.add("roberto");    // 0
        persone.add("simone");     // 1
        persone.add("liuba");      // 2

        persone.set(1,"emily");  // se vogliamo modificare SET una persona
        persone.remove(0);  //se voglio togliere/rimuovere un indice in questo caso 0 roberto
        persone.clear();   // se vogliamo pulire la nostra arrayLIST quindi cancellare tutti gli indici

        System.out.println(persone.get(0));  //utilizziamo get invece del []

        //li vogliamo ciclare tutti
        for (int i=0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }

    }
}
