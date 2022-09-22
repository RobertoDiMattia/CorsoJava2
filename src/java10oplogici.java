// operatori logici    AND &&   OR ||   NOT !

public class java10oplogici {
    public static void main(String[] args) {

        boolean x = 3 < 10 && 3 % 2 == 0; // true and false = false
        boolean y = 3 < 10 || 3 % 2 == 0; // true or false = true

        System.out.println(x);
        System.out.println(y);
        System.out.println(!(y));  // not negazione inverto il risultato booleano
    }
}
