public class emploayouch extends perchon {
    private double salaire;
    private String pro;

    public emploayouch(String nom, String prenom, String nais, double salaire, String pro) {
        super(nom, prenom, nais);
        this.salaire = salaire;
        this.pro = pro;
    }

    public double getsalaire() {
        return this.salaire;
    }

    public String getpro() {
        return this.pro;
    }

    public void setpro(String pro) {
        this.pro = pro;
    }

    public void setsalaire(double salaire) {
        this.salaire = salaire;
    }

    public void affiche() {
        super.affiche();
        System.out.println("salaire :  " + this.salaire + "DA   preorite :  " + this.pro);
    }

}
