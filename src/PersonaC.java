public class PersonaC {

    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    PersonaC(String nome, String cognome, int eta, String colorePreferito) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }
    // applicare toString (EREDITARIETA')

    public String toString(){
        String stringa = this.nome +"\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito + "\n";
        return stringa;
    }
}
