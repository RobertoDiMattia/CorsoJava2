public class Misure {

    public static void main(String[] args) {
        boolean ilBoolean = false;          //boolean |                                   | 1 bit
        byte ilByte = 127;                  //byte    | -128 : 127                        | 1 byte
        short ilShort = 32767;              //short   | -32768 : 32767                    | 2 bytes
        int ilInt = 2000000000;             //int     | -2 miliardi : 2 m.                | 4 bytes
        long ilLong = 900000000000L;        //long    | -9 quintilioni : 9 q.             | 8 bytes

        float ilFloat = 1.123456f;          //float   | num. con 6-7 cifre decimali       | 4 bytes
        double ilDouble = 1.12345678901234; //double  | num. con 15 cifre decimali        | 8 bytes

        char ilChar = 'f';                  //char    | singolo caratt./lettera/ASCII ''  | 2 bytes
        String laStringa = "ciao da me";    //String  | sequenza di caratteri ""          | varabile

        System.out.println(laStringa.toUpperCase());
    }
}
