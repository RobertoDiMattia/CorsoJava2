public class Studente extends PersonaC {

    String materiaPreferita = "Storia";
    String classe = "2D";
    int[] votiStoria = {9,9,9};

    Studente(String nome, String cognome, int eta, String colorePreferito) {
        super(nome, cognome, eta, colorePreferito);
    }

    void studia() {
        System.out.println("si amore, sto studiando");
    }
    @Override
    void saluta() {
        System.out.println("Buongiorno prof");
    }
}
