import java.util.ArrayList;

public class eleve {
    private String nom;
    private ArrayList<Integer> listenote;
    private double moyenne;
    private double somme;

    public eleve(String nom) {
        this.nom = nom;
        this.somme = 0;
        this.moyenne = 0;
        this.listenote = new ArrayList<Integer>();

    }

    public double getmoy() {
        return this.moyenne;
    }

    public String getnom() {
        return this.nom;
    }

    public ArrayList<Integer> getlist() {
        return this.listenote;
    }

    public void ajoutenot(int note) {
        this.listenote.add(note);
        this.somme = this.somme + note;
        this.moyenne = this.somme / listenote.size();
    }

    public void tostring() {
        System.out.println(this.getnom() + "(" + String.valueOf(this.getmoy()) + ")");
    }

}
