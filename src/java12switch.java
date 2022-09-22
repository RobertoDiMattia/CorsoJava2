public class java12switch {
    public static void main(String[] args) {
        String nome = "roberto";

       /* if ("roberto".equals(nome)) {
            System.out.println("ciao roberto"); */

        switch(nome) {
            case "simone":
                System.out.println("ciao simone");
                break;
            case "liuba":
                System.out.println("ciao liuba");
                break;
            case "emily":
                System.out.println("ciao emily");
                break;
            case "federico":
                System.out.println("ciao federico");
                break;
            default:
                System.out.println("ciao chiunque tu sia");
        }
    }
}
