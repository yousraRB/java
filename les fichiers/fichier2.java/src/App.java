
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner st = new Scanner(System.in);
        System.out.println("atini chhal mn produit haha");
        int nb = st.nextInt();
        System.out.println("atini assem lfichier ");
        String assem = st.next();
        int i;
        String nom, numero;
        double prix;
        long sc;

        ArrayList<product> lista = new ArrayList<product>();
        productDao p;
        p = new productDao();
        /*
         * for (i = 0; i < nb; i++) { System.out.
         * println("atini  numero sinon nz3f bsh ana z3ft aw z3f aw bka jibolo haba halwa haha"
         * ); numero = st.next(); System.out.println("atini le nom :"); nom = st.next();
         * System.out.println("atini le sc :"); sc = st.nextLong();
         * System.out.println("atini le prix :"); prix = st.nextDouble(); lista.add(new
         * product(numero, nom, sc, prix)); }
         * 
         * p.save(lista, assem);
         */

        lista = p.restore(assem);
        System.out.println(lista);
        for (product p1 : lista) {
            p1.affiche();
        }

    }
}
