public class Insegnante extends PersonaC {

    String materia = "matematica";
    String[] classi = {"1d","2d","3d"};

    Insegnante(String nome, String cognome, int eta, String colorePreferito) {
        super(nome, cognome, eta, colorePreferito);
    }

    void insegna() {
        System.out.println("sto insegnando...");
    }
    @Override
    void saluta() {
        System.out.println("buongiorno ragazzi");
    }
}
