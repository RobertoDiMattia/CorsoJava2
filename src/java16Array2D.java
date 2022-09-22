public class java16Array2D {
    public static void main(String[] args) {

        String[][] classi = new String[3][3];  //3 classi e 3 studenti

        classi[0][0] = "roberto";              // TABELLA
        classi[0][1] = "simone";
        classi[0][2] = "federico";

        classi[1][0] = "liuba";
        classi[1][1] = "emily";
        classi[1][2] = "pamela";

        classi[2][0] = "flavio";
        classi[2][1] = "cristian";
        classi[2][2] = "diego";

        System.out.println(classi[2][1]);

        /*           0        1        2
        riga 0  -> roberto  simone  federico
        riga 1  -> liuba    emily    pamela
        riga 2  -> flavio   cristian diego
         */

        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.println(classi[classe][studente] + " ");
            }
        }
    }
}