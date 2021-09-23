public class comptebancaire {
    private String populaire;
    private double solde = 0;

    public comptebancaire(String nom) {
        this.populaire = nom;
    }

    public comptebancaire(String nom, double solde) {
        this.populaire = nom;
        this.solde = solde;
    }

    public String getpop() {
        return this.populaire;
    }

    public double getsolde() {
        return this.solde;
    }

    public void setpop(String pop) {
        this.populaire = pop;
    }

    public void setsolde(double solde) {
        this.solde = solde;
    }

    public void affiche() {
        System.out.println("titulaire :" + this.populaire + " solde :" + this.solde);
    }

    public void depot(double som) {
        this.solde = this.solde + som;
    }

    public void retrait(double som) {
        this.solde = this.solde - som;
    }
}
