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

        /**
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("chhal 3ndk mn ktab"); int n = sc.nextInt();
         * ArrayList<livre> HAJA = new ArrayList<>(); for (int i = 0; i < n; i++) {
         * System.out.println(" atini asm le livre "); String titre = sc.next();
         * System.out.println("le nombre de pages "); int nb = sc.nextInt(); livre ok
         * =new livre(nb, titre); HAJA.add(ok); } for (livre ok : HAJA) { ok.afficher();
         * }
         */
        /**
         * crivez une classe Domino pour représenter une pièce de domino. Les objet sont
         * initialisés avec les valeurs des deux faces, A et B. Ajoutez une méthode
         * .affiche_points() qui affiche les valeurs des deux faces, et une méthode
         * .totale() qui retourne la somme de deux valeurs
         */

        /**
         * Scanner sc = new Scanner(System.in); System.out.println("la face lwla mdhali
         * : "); int a = sc.nextInt(); System.out.println("la face 2em doka :"); int b =
         * sc.nextInt(); domino dom = new domino(a, b); dom.affiche();
         * System.out.println("la somme : " + dom.som());
         */

        /**
         * : Écrivez une classe CompteBancaire. Les objets sont initialisés avec le nom
         * du titu- laire et le solde. L’argument solde doit être facultatif et avoir
         * une valeur prédéfinie zéro. Ajoutez deux méthodes .depot(somme) et
         * .retrait(somme) pour changer le solde. Ajoutez une méthode .affiche() qui
         * montre le solde courant
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("atini 3adad les compt ");
        int n = sc.nextInt();
        ArrayList<comptebancaire> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("atini asm siyd ");
            String nom = sc.next();
            System.out.println("atini solde ");
            double solde = sc.nextDouble();
            comptebancaire cb = new comptebancaire(nom, solde);
            lista.add(cb);
        }
        for (comptebancaire cb : lista) {
            cb.affiche();
        }
        System.out.println("asssm mol lcompt :         ");
        String nom = sc.next();
        System.out.println("la som lihbit tzidha  :         ");
        double som = sc.nextDouble();
        for (comptebancaire cb : lista) {
            if (cb.getpop().equals(nom)) {
                cb.depot(som);
            }
        }
        for (comptebancaire cb : lista) {
            cb.affiche();
        }

    }
}
