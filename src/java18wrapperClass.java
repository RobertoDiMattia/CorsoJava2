// le wrapper class permettono di utilizzare dati primitivi come reference

public class java18wrapperClass {
    public static void main (String[] args) {

            Boolean vero = true;
            Character carattere = 'a';
            Integer numero = 5;
            Double virgola = 5.22;
            String stringa = "bel corso";

            boolean a = true;
            char b = 'a';
            int c = 5;
            double d = 5.22;

            if(vero == a) {
                System.out.println("prova");
            }
            if (carattere == b) {
                System.out.println("di nuovo");
            }
            if (numero == c) {
                System.out.println("ancora");
            }
            if (virgola == d) {
                System.out.println("perfetto");
            }
    }
}
