public class java27arrayOGGETTI {

    public static void main(String[] args) {

        PersonaC[] persone = new PersonaC[3];

        PersonaC persona1 = new PersonaC("roberto","di mattia", 42,"blu");
        PersonaC persona2 = new PersonaC("simone","gg", 32,"verde");
        PersonaC persona3 = new PersonaC("a","bi",29,"rosso");

        persone[0] = persona1;
        persone[1] = persona2;

        persone[2] = persona3;

        System.out.println(persone[1]);
        System.out.println(persone[2]);
    }
}
