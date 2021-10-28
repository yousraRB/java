public class factoriel {
    private int n;

    public factoriel(int n) {
        this.n = n;
    }

    public int getn() {
        return this.n;
    }

    public void setn(int n) {
        this.n = n;
    }

    public int fact() throws Exception {
        if (this.n < 0)
            throw new Exception("rak ghalet !");
        int f = 1;
        int i;
        for (i = 2; i <= this.n; i++) {
            f = f * i;
        }
        return f;
    }

    public void affiche() throws Exception {
        System.out.println("fact of " + this.n + " is :" + this.fact());
    }

}
