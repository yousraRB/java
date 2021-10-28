
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("medli l n");
        int n = sc.nextInt();
        try {
            factoriel f = new factoriel(n);

            f.affiche();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("atini l9Assim");
        int a = sc.nextInt();
        System.out.println("atini lma9Assom");
        int b = sc.nextInt();
        div d;

        try {
            d = new div(a, b);
            d.affiche();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
