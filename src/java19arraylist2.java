import java.util.ArrayList;

public class java19arraylist2 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> classi = new ArrayList();

        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("roberto");
        classe1.add("liuba");

        ArrayList<String> classe2 = new ArrayList<String>();

        classe2.add("dea");
        classi.add(classe1);
        classe2.add("simone");
        classi.add(classe2);
        for(int i=0; i< classi.size(); i++) {

            System.out.println();
            for (int j=0; j<classi.get(i).size(); j++) {
                System.out.println(classi.get(i).get(j) + " ");
            }
        }

    }
}
