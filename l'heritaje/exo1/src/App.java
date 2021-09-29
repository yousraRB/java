import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println(" le nom :");
        String nom = sc.next();
        eleve e;
        e = new eleve(nom);
        System.out.println(" le nombre des notes : ");
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(" la note " + (i + 1));
            int note = sc.nextInt();
            if (note < 0) {
                note = 0;
            } else if (note > 20) {
                note = 20;
            }
            e.ajoutenot(note);
        }
        double moy;
        moy = e.getmoy();
        System.out.println(e.getnom() + "(" + e.getmoy() + ")");
        e.tostring();

    }
}
