public class rectongle {
    private double longeur;
    private double largeur;

    public rectongle(double a, double b) {
        this.largeur = b;
        this.longeur = a;
    }

    public double geta() {
        return this.longeur;
    }

    public double getb() {
        return this.largeur;
    }

    public void seta(double a) {
        this.longeur = a;
    }

    public void setb(double b) {
        this.largeur = b;
    }

    public double surface() {
        return this.largeur * this.longeur;
    }

    public double perimetre() {
        return (this.largeur + this.longeur) * 2;
    }

    public void affiche() {
        System.out.println("longeur :" + this.longeur + "largeur :" + this.largeur + "surface :" + this.surface()
                + "perimetre :" + this.perimetre());
    }
}
