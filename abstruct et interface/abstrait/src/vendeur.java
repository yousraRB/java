public class vendeur extends employe {
    private int ca;
    private double prix = 0.05;

    public vendeur(String nom, String prenom, int age, String date, int ca) {
        super(nom, prenom, age, date);
        this.ca = ca;
    }

    @Override
    public double salaire() {

        return this.ca * this.prix;
    }

}
