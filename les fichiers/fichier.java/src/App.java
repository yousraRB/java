import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        File f = new File("src/configuration.txt");
        Scanner sc = new Scanner(f);
        database b = null;
        String host;
        String user;
        String password;
        String data;
        data = sc.nextLine();

        if (data.equals("database")) {
            data = sc.nextLine();
            host = data.split(":")[1];
            data = sc.nextLine();
            user = data.split(":")[1];
            data = sc.nextLine();
            password = data.split(":")[1];
            System.out.println(host + " " + user + " " + password);
            b = new database(host, user, password);
        }
        log l = null;
        data = sc.nextLine();
        if (data.equals("log")) {
            data = sc.nextLine();
            host = data.split(":")[1];
            data = sc.nextLine();
            user = data.split(":")[1];
            System.out.println(host + " " + user);
            l = new log(host, user);
        }
        security s = null;
        data = sc.nextLine();
        if (data.equals("security")) {
            data = sc.nextLine();
            host = data.split(":")[1];
            data = sc.nextLine();
            password = data.split(":")[1];
            System.out.println(host + " " + password);
            s = new security(host, password);
        }
        s.affiche();
        l.affiche();
        b.affiche();

    }
}
