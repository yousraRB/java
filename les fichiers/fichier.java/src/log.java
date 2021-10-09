public class log {
    private String file;
    private String level;

    public log(String file, String level) {
        this.file = file;
        this.level = level;
    }

    public String getfile() {
        return this.file;
    }

    public String getlevel() {
        return this.level;
    }

    public void setfile(String file) {
        this.file = file;
    }

    public void setlevel(String level) {
        this.level = level;
    }

    public void affiche() {
        System.out.println("file :" + this.file + "        level:" + this.level);
    }
}
