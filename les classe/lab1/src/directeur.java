public class directeur extends employe {
    private societe noms;

    public directeur(String nom, String prenom, int nais, double salaire, societe noms) {
        super(nom, prenom, nais, salaire);
        this.noms = noms;
    }

    public societe getnoms() {
        return this.noms;
    }

    public void setnom(societe noms) {
        this.noms = noms;
    }

    public void affiche() {
        super.affiche();
        System.out.println("nom de societé " + this.noms.getnom());
    }

}
