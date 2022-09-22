//ARRAY collezione di dati correlati tra loro

public class java15ARRAY {
    public static void main(String[] args) {

        // int votoita ={3,6,11,13,30};

        int[] numeri = new int [3]; //creato array vuoto "numeri è un array di interi con lunghezza 3"

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;       //elementi dell'array
        // numeri[3] = 40;
        // numeri[4] = 50;

        System.out.println(numeri.length);
        System.out.println(numeri[1]);

        numeri[1] = 100;
        System.out.println(numeri[1]);

    }
}
