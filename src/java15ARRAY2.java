public class java15ARRAY2 {
    public static void main(String[] args) {

        int[] numeri = {10, 20, 30, 40};

        /*System.out.println(numeri[0]);  //gli indici partano da ZERO...lenght la lunghezza è la quantità di oggetti
        System.out.println(numeri.length);
        System.out.println(numeri[numeri.length - 1]); //System.out.println(numeri[numeri.length]); nessun dato*/

        // for
        for(int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }
        // foreach
        for (int numero: numeri) {
            System.out.println(numero);
        }
    }
}
