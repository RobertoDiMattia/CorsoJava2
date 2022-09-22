/* IF
   ELSE
   ELSE IF
   IF annidati
   Temary operator
 */

public class java11if {
    public static void main(String[] args) {
        boolean isOnline = true;

        /* if(isOnline) {
            System.out.println("Non è online");
        }else {
            System.out.println("Sei online");
        }

        --------------------------------------

         String nome = "Roberto";

        if(nome == "Roberto") {
            System.out.println("è online");
        }else {
            System.out.println("non è online");
        } */

        String nome = "Roberto";  // è Roberto
        // è qualcun altro   nome = "Anna";
        // è Simone   nome = "Simone";

        if(nome == "Roberto") {
            System.out.println("è Roberto");
        }else if(nome == "Simone") {
            System.out.println("è Simone");
        }else {
            System.out.println("è qualcun altro");
        }
    }
}
