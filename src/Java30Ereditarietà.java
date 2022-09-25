// meccanismo che permette ad una classe di derivare da un'altra classe ed ederitarne metodi e attributi
// creo nuove classi Studente e Insegnante

public class Java30Ereditarietà {

    public static void main(String[] args) {

        PersonaC persona1 = new PersonaC("roberto","dm",42,"blu");
        persona1.saluta();

        Studente studente1 = new Studente("Simone","gg",32,"verde");
        studente1.saluta();
        System.out.println(studente1.nome);

        studente1.studia();

        Insegnante insegnante1 = new Insegnante("simone","giga",32,"verde");
        insegnante1.insegna();
        insegnante1.saluta();
    }
}
