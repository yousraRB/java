public class employe extends personne {
    private double salaire;

    public employe(String nom, String prenom, int nais, double salaire) {
        super(nom, prenom, nais);
        this.salaire = salaire;
    }

    public double getsalaire() {
        return this.salaire;
    }

    public void setsalaire(double sal) {
        this.salaire = sal;
    }

    public void affiche() {
        super.affiche();
        System.out.println("salaire :" + this.salaire + " DA");
    }

}
