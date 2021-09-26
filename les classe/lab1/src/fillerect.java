public class fillerect extends rectongle {
    private double hauteur;

    public fillerect(double a, double b, double h) {
        super(a, b);
        this.hauteur = h;
    }

    public double geth() {
        return this.hauteur;
    }

    public void seth(double h) {
        this.hauteur = h;
    }

    public double volume() {
        return super.surface() * this.hauteur;

    }

}
