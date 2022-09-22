//INTRODUZIONE OOP = Object Orienteded Programming

public class java22OOP {  //creiamo una classe PERSONA dove mettere

    public static void main(String[] args) {

        //tipo   variabile       stampino nella classe PERSONA
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println(persona1.nome);
        System.out.println(persona2.colorePreferito);

        persona1.saluta();
        persona2.cammina();
    }
}
