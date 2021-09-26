public class perchon {
    private String nom;
    private String prenom;
    private String nais;

    public perchon(String nom, String prenom, String nais) {
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

    public String getnais() {
        return this.nais;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public void setnais(String nais) {
        this.nais = nais;
    }

    public void affiche() {
        System.out.print("nom :    " + this.nom + "     prenom:   " + this.prenom + "    date de naissance :  " + nais);
    }
}
