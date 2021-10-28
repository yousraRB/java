
public abstract class employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;

    public employe(String nom, String prenom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getnom() {
        return this.nom;
    }

    public String getprenom() {
        return this.prenom;
    }

    public String getdate() {
        return this.date;
    }

    public int getage() {
        return this.age;
    }

    public abstract double salaire();

    public void affiche() {
        System.out.println("[nom:" + this.nom + "  |prenom: " + this.prenom + " |age: " + this.age);
    }

}
