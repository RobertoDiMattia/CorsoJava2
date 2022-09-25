public class PersonaC {

    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    static int numeroPersone;  //aggiunto static per lezione java29

    PersonaC(String nome, String cognome, int eta, String colorePreferito) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        numeroPersone++;                   //java29
        System.out.println(numeroPersone);  // java29
    }
    // applicare toString (EREDITARIETA')

    public String toString(){
        String stringa = this.nome +"\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito + "\n";
        return stringa;
    }
//lezione java 28
    void saluta(PersonaC personaDaSalutare) {
        System.out.println("Ciao " + personaDaSalutare.nome + "," + " io sono " + this.nome);
    }
// fatto io prova con java28
    void cammina(PersonaC personaCheCammina) {
        System.out.println(personaCheCammina.nome + " sta camminando");
    }
    // per lezione java30
    void saluta() {
        System.out.println("Ciao!");
    }

    static void mostraNumPersone() {            //static per lezione java29
        System.out.println("il numero di persone create è: " + numeroPersone);
    }
}
