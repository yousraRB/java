public class personne {
    private String nom;
    private String prenom;
    private int nais;

    public personne(String nom, String prenom, int nais) {
        this.nom = nom;
        this.prenom = prenom;
        this.nais = nais;
    }

    public String getnom() {
        return this.nom;
    }

    public String getprenom() {
        return this.prenom;
    }

    public int getnais() {
        return this.nais;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public void setnais(int nais) {
        this.nais = nais;
    }

    public void affiche() {
        System.out.print(this.nom + " " + this.prenom + " " + this.nais);
    }

}
