public class domino {
    private int a;
    private int b;

    public domino(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int geta() {
        return this.a;

    }

    public int getb() {
        return this.b;
    }

    public void seta(int a) {
        this.a = a;
    }

    public void setb(int b) {
        this.b = b;
    }

    public void affiche() {
        System.out.println("la face lawla " + a + "  la face 2em " + b);
    }

    public int som() {

        return this.a + this.b;
    }
}
