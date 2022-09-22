public class java16array2D3foreach {
    public static void main(String[] args) {

        String[][] classi = {
                              {"roberto", "simone", "federico"},   //indice 0
                              {"liuba", "emily", "pamela"},        //indice 1
                              {"flavio", "cristian", "diego"}     //indice 2
        };

        for (String[] classe: classi) {
            System.out.println();
            for (String studente: classe) {
                System.out.print(studente + " ");

            }
        }

        }

    }
