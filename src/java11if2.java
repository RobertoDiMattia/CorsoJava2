public class java11if2 {
    public static void main(String[] args) {
        int numero = 3;

        if(numero < 10) {
            System.out.println("è minore di 10");
            if(numero % 2 == 0) {
                System.out.println("è pari");
            }else {
                System.out.println("è dispari");
            }
        }
    }

}