public class product {
    private String pn;
    private String name;
    private long sc;
    private double prx;

    public product(String pn, String name, long sc, double prix) {
        this.pn = pn;
        this.name = name;
        this.sc = sc;
        this.prx = prix;

    }

    public String getpn() {
        return this.pn;
    }

    public String getname() {
        return this.name;
    }

    public long getsc() {
        return this.sc;
    }

    public double getlong() {
        return this.prx;
    }

    public void setpn(String pn) {
        this.pn = pn;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setsc(long sc) {
        this.sc = sc;
    }

    public void setprx(double prix) {
        this.prx = prix;
    }

    public void affiche() {
        System.out.println("number product " + this.pn + "    name:" + this.name + "   stock count :" + this.sc
                + "   prix :" + this.prx + "DA");
    }

}
