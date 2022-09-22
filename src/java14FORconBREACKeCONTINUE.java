public class java14FORconBREACKeCONTINUE {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i == 4) {
                continue;  //salta il ciclo 4 e continua
                //breack; rompe il ciclo
            }
            System.out.println(i);
        }
    }
}

