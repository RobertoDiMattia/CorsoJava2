// CHIAVE this,  per costruire nella classe oggetto PersonaC

public class java23oop2COSTRUTTORI {

    public static void main(String[] args) {

        PersonaC persona1 = new PersonaC("roberto", "di mattia", 42, "blu");
        PersonaC persona2 = new PersonaC("simone","gigantini", 32,"verde");

        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);
        System.out.println(persona1.colorePreferito);

    }
}
