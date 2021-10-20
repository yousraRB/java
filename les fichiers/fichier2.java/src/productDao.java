import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class productDao {

    public void save(ArrayList<product> products, String filePath) {
        // declaration de fichier
        FileWriter f;
        try {
            // ouverture mode ecriture
            f = new FileWriter(filePath, true);
            String ligne;

            for (product p : products) {
                // java yfhmha nrml python nonnnnnnn
                ligne = p.getpn() + "#" + p.getname() + "#" + p.getsc() + "#" + p.getlong() + "\n";
                f.write(ligne);

            }
            f.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public ArrayList<product> restore(String filePath) {
        // mode lecteur assignee
        File f = new File(filePath);

        Scanner sc;
        ArrayList<product> lista = new ArrayList<product>();

        try {
            // relire
            sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String[] text = sc.nextLine().split("#");
                product p = new product(text[0], text[1], Long.valueOf(text[2]), Double.valueOf(text[3]));
                lista.add(p);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lista;

    }

}
