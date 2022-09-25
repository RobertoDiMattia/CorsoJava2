//useremo PersonaC e andremo ad inserire void

public class java28daOggettiaParametri {

    public static void main(String[] args) {

        PersonaC persona1 = new PersonaC("Roberto","Di M",42,"blu");
        PersonaC persona2 = new PersonaC("Simone","nabbo",32,"verde");

        persona1.saluta(persona2);
        persona2.saluta(persona1);
        // fatto io prova
        persona1.cammina(persona1);
        persona2.cammina(persona2);
    }
}
