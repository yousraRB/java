public class tableMULT {
    private int nombre;
    private int cpt = 0;

    public tableMULT(int nombre) {
        this.nombre = nombre;

    }

    public int getn() {
        return this.nombre;
    }

    public void setn(int nombre) {
        this.nombre = nombre;
    }

    public void affiche() {
        System.out.println(this.nombre);
    }

    public void prochaine() {
        System.out.println(this.nombre + "*" + this.cpt + "=" + (this.nombre * this.cpt));
        this.cpt = this.cpt + 1;

    }

}