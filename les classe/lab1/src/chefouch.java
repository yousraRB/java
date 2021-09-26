public class chefouch extends emploayouch {
    private String service;

    public chefouch(String nom, String prenom, String nais, double salaire, String pro, String service) {
        super(nom, prenom, nais, salaire, pro);
        this.service = service;

    }

    public String getservice() {
        return service;
    }

    public void setservice(String service) {
        this.service = service;
    }

    public void affiche() {
        super.affiche();
        System.out.println(" service :" + this.service);
    }
}
