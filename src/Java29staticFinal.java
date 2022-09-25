//final indica una variabile che non può essere modificata nel corso del programma
//static quell'attributo è univoco per tutte le istanze della classe (ovvero condiviso per tutte le istanze)

public class Java29staticFinal {

    public static void main(String[] args) {
/*
        final int prova =5;

        System.out.println(prova);*/

        //per static andiamo in PersonaC dove lo inseiremo negli attributi per poi continuare qui creando new PersonaC

        PersonaC persona1 = new PersonaC("roberto","D M",42,"blu");
        PersonaC persona2 = new PersonaC("simone","gg",32,"verde");

        PersonaC.mostraNumPersone();

        System.out.println("numero persone: " + PersonaC.numeroPersone);
    }
}
