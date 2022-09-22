public class java20funzioni2 {
    public static void main(String[] args) {

        //addizione(10,10);  //parametri
        int totaleSpeso = addizione(10,10);
        int prova = addizione(10,10);
        System.out.println(prova
        );
        System.out.println(totaleSpeso);

    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        System.out.println(risultato);
        return risultato;
    }
}
