public class societe {

    private String nom;
    private int nombre;

    public societe(String nom, int nombre) {
        this.nom = nom;
        this.nombre = nombre;
    }

    public societe() {

    }

    public int getnombre() {
        return this.nombre;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setnombre(int nombre) {
        this.nombre = nombre;
    }

    public void affiche() {
        System.out.println("nom de societé " + this.nom + "nombre des employe" + this.nombre);
    }
}
