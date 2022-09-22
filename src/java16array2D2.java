public class java16array2D2 {
    public static void main(String[] args) {

        String[][] classi = {
            {
                "roberto", "simone", "federico"   //indice 0
            },
            {
                "liuba", "emily", "pamela"        //indice 1
            },
            {
                "flavio", "cristian", "diego"     //indice 2
            }
        };

        for (int classe =0; classe < classi.length; classe++) {
            System.out.println(classe);
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.println(classi[classe][studente] + " ");
            }
        }
    }
}
