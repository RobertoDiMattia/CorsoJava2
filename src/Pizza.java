public class Pizza {

    String impasto;
    String salsa;
    String formaggio;
    String extra;

    Pizza(String impasto){
        this.impasto = impasto;
        System.out.println("ingredienti " + impasto);
    }

    Pizza(String impasto,String salsa){
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("ingredienti " + impasto + "," + salsa);

    }

    Pizza(String impasto, String salsa, String formaggio){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        System.out.println("ingredienti " + impasto + "," + salsa + "," + formaggio);

    }
    Pizza(String impasto, String salsa, String formaggio, String extra){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;

        System.out.println("ingredienti " + impasto + "," + salsa + "," + formaggio + "," + extra);
    }
}
