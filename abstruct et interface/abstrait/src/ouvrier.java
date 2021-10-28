public class ouvrier extends employe {
    private int prix = 250;
    private int nbr;

    public ouvrier(String nom, String prenom, int age, String date, int nbr) {
        super(nom, prenom, age, date);
        this.nbr = nbr;
    }

    @Override
    public double salaire() {

        return this.nbr * this.prix;
    }

}
