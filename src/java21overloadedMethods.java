public class java21overloadedMethods {
    public static void main(String[] args)  {

        int doppioInt = addizione(2,3);
        int triploInt = addizione(2,4,9);
        double doppioDouble = addizione(2.5, 6.3);

        System.out.println(doppioInt);
        System.out.println(triploInt);
        System.out.println(doppioDouble);
    }

    static int addizione(int a,int b) {
        int risultato = a + b;
        return risultato;
    }
    static int addizione(int a, int b, int c) {
        int risultato = a + b + c;
        return risultato;
    }
    static double addizione(double a, double b) {
        double risultato = a + b;
        return risultato;
    }
}
