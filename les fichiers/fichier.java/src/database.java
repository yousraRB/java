public class database {
    private String host;
    private String user;
    private String password;

    public database(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public String gethost() {
        return this.host;
    }

    public String getuser() {
        return this.user;
    }

    public String getpassword() {
        return this.password;
    }

    public void sethost(String host) {
        this.host = host;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void affiche() {
        System.out.println("host :" + this.host + "  /  user:" + this.user + "  /  password :" + this.password);

    }

}
