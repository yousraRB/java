public class security {
    private String cipher;
    private String algo;

    public security(String cipher, String algo) {
        this.cipher = cipher;
        this.algo = algo;
    }

    public String getfcipher() {
        return this.cipher;
    }

    public String getalgo() {
        return this.algo;
    }

    public void setcipher(String cipher) {
        this.cipher = cipher;
    }

    public void setalgo(String algo) {
        this.algo = algo;
    }

    public void affiche() {
        System.out.println("cipher :" + this.cipher + "       algo:" + this.algo);
    }
}
