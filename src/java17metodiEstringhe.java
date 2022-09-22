public class java17metodiEstringhe {
    public static void main(String[] args) {
        String nome = "    Roberto    ";
        // boolean risultato = nome.equalsIgnoreCase("Roberto");  TRUE VERO
        // int risultato = nome.length();               7 lunghezza della parola
        //char risultato = nome.charAt(0);               char posizione della lettera nella parola
        //int risultato = nome.indexOf("o");
        //boolean risultato = nome.isEmpty();             la stringa è vuota? vero o falso
        //String risultato = nome.toUpperCase();            tutto maiuoscolo
        //String risultato = nome.toLowerCase();            tutto minuscolo
        /*String risultato = nome.trim();     conta gli spazi nella stringa


                System.out.println(nome); */
        String risultato = nome.replace("o","w");   //cambia lettere nella stringa nome
                System.out.println(risultato);


    }
}
