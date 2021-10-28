import java.rmi.server.ExportException;

public class div {
    private int a;
    private int b;

    public div(int a, int b) {
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

    public double division() throws Exception {
        if (this.b == 0)
            throw new Exception("division 3la 0 impossible !");
        return this.a / this.b;
    }

    public void affiche() throws Exception {
        System.out.println(this.a + "/" + this.b + "=" + this.division());
    }
}
