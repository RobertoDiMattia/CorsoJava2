import java.util.Scanner;

public class java6Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual'è il tuo nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("qual'è la tua età?");
        int eta = scanner.nextInt();   // int non va "a capo" in automatico
        scanner.nextLine();            // creato "a capo"

        System.out.println("In che città vivi?");
        String citta = scanner.nextLine();

        System.out.println("ciao " + nome + " " + cognome);
        System.out.println("hai" + " " + eta + " " + "anni");
        System.out.println("Vivi a" + " " + citta);
    }
}
