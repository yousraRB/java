public class livre {
    private int nbpage;
    private String nom;

    public livre(int nbpage, String nom) {
        this.nbpage = nbpage;
        this.nom = nom;
    }

    public int getnbpage() {
        return this.nbpage;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnbpage(int nb) {
        this.nbpage = nb;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void afficher() {
        System.out.println("le livre " + this.nom + " 3ando " + this.nbpage + " page");
    }

}
