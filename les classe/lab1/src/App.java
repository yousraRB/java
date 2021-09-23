import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * System.out.println("Hello, me"); String a = "salam"; System.out.println(a);
         * int b = 5; double c = 3; System.out.println("b=" + b + "c=" + c); Scanner sc
         * = new Scanner(System.in); System.out.println("atini valeur"); int d =
         * sc.nextInt(); System.out.println("la variable t3k is :" + d);
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("chhal 3ndk mn ktab");
        int n = sc.nextInt();
        ArrayList<livre> HAJA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println(" atini asm le livre ");
            String titre = sc.next();
            System.out.println("le nombre de pages ");
            int nb = sc.nextInt();
            livre ok = new livre(nb, titre);
            HAJA.add(ok);
        }
        for (livre ok : HAJA) {
            ok.afficher();
        }

    }
}
