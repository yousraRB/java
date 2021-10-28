public class technicien extends employe {
    private int prix = 400;
    private int prima = 5000;
    private int nbr;

    public technicien(String nom, String prenom, int age, String date, int nbr) {
        super(nom, prenom, age, date);
        this.nbr = nbr;
    }

    @Override
    public double salaire() {

        return this.nbr * this.prix + this.prima;

    }

}
