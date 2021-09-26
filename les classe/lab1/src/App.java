import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * System.out.println("Hello, me"); String a = "salam"; System.out.println(a);
         * int b = 5; double c = 3; System.out.println("b=" + b + "c=" + c); Scanner sc
         * = new Scanner(System.in); System.out.println("atini valeur"); int d =
         * sc.nextInt(); System.out.println("la variable t3k is :" + d);
         */

        /**
         * Scanner sc = new Scanner(System.in); System.out.println("chhal 3ndk mn
         * ktab"); int n = sc.nextInt(); ArrayList<livre> HAJA = new ArrayList<>(); for
         * (int i = 0; i < n; i++) { System.out.println(" atini asm le livre "); String
         * titre = sc.next(); System.out.println("le nombre de pages "); int nb =
         * sc.nextInt(); livre ok =new livre(nb, titre); HAJA.add(ok); } for (livre ok :
         * HAJA) { ok.afficher(); }
         */
        /**
         * crivez une classe Domino pour représenter une pièce de domino. Les objet sont
         * initialisés avec les valeurs des deux faces, A et B. Ajoutez une méthode
         * .affiche_points() qui affiche les valeurs des deux faces, et une méthode
         * .totale() qui retourne la somme de deux valeurs
         */

        /**
         * Scanner sc = new Scanner(System.in); System.out.println("la face lwla mdhali:
         * ");
         * 
         * int a = sc.nextInt(); System.out.println("la face 2em doka :"); int b
         * =sc.nextInt(); domino dom; dom =new domino(a,b); dom.affiche();
         * System.out.println("la somme : " + dom.som());
         */

        /**
         * : Écrivez une classe CompteBancaire. Les objets sont initialisés avec le nom
         * du titu- laire et le solde. L’argument solde doit être facultatif et avoir
         * une valeur prédéfinie zéro. Ajoutez deux méthodes .depot(somme) et
         * .retrait(somme) pour changer le solde. Ajoutez une méthode .affiche() qui
         * montre le solde courant
         */
        /**
         * Scanner sc = new Scanner(System.in); System.out.println("atini 3adad les
         * compt "); int n = sc.nextInt(); ArrayList<comptebancaire> lista = new
         * ArrayList<>();
         * 
         * for (int i = 0; i < n; i++) { System.out.println("atini asm siyd "); String
         * nom = sc.next(); System.out.println("atini solde "); double solde =
         * sc.nextDouble(); comptebancaire cb = new comptebancaire(nom, solde);
         * lista.add(cb); } for (comptebancaire cb : lista) { cb.affiche(); }
         * System.out.println("asssm mol lcompt : "); String nom = sc.next();
         * System.out.println("la som lihbit tzidha : "); double som = sc.nextDouble();
         * for (comptebancaire cb : lista) { if (cb.getpop().equals(nom)) {
         * cb.depot(som); } } for (comptebancaire cb : lista) { cb.affiche(); }
         **/
        /**
         * crivez une classe TableMultiplication qui crée des objets initialisés avec un
         * nombre entier. Ajouter une méthode .prochain() qui renvoie à chaque appel un
         * nouveau terme de la table de multiplication correspondante
         */

        /**
         * Scanner sc = new Scanner(System.in); System.out.println("aktb le nombre ");
         * int choix = 1; int n = sc.nextInt();
         * 
         * tableMULT tm; tm = new tableMULT(n);
         * 
         * while (choix == 1) { tm.prochaine(); System.out.println( "ida rak hab zid dir
         * la multiplicatin de" + n + "avec le prochaine nombre dkhel 1 sinon dir 0");
         * choix = sc.nextInt(); }
         */
        /**
         * 1. Ecrire une classe Rectangle, permettant de construire un rectangle dotée
         * d'attributs longueur et largeur. 2. Créer une méthode Perimetre() permettant
         * de calculer le périmètre du rectangle et une méthode Surface() permettant de
         * calculer la surface du rectangle 3. Créer une classe fille Parallelepipede
         * héritant de la classe Rectangle et dotée en plus d'un attribut hauteur et
         * d'une autre méthode Volume() permettant de calculer le volume du
         * Parallélépipède.
         */
        /**
         * Scanner sc = new Scanner(System.in); System.out.println("longeur : "); double
         * a = sc.nextDouble(); System.out.println("largeur: "); double b =
         * sc.nextDouble(); System.out.println("hauteur : "); double h =
         * sc.nextDouble(); rectongle rect; rect = new rectongle(a, b); rect.affiche();
         * fillerect frct; frct = new fillerect(a, b, h); System.out.println("volume : "
         * + frct.volume());
         */
        /**
         * Soit Les classes suivantes : La classe Personne qui comporte trois attributs
         * privés, nom, prénom et année de naissance. Cette classe comporte un
         * constructeur pour permettre d’initialiser les attributs. Elle comporte
         * également une méthode polymorphe afficher () pour afficher les données de
         * chaque personne. La classe Employé qui hérite de la classe Personne, avec en
         * plus un attribut privé salaire, un constructeur et la redéfinition de la
         * méthode afficher () qui permet d’afficher le salaire. La classe Directeur qui
         * hérite de la classe Employé, avec en plus un attribut (instance d’objet)
         * société, un constructeur et la redéfinition de la méthode afficher () qui
         * permet d’afficher le nom de la société. La classe Société qui comporte le nom
         * de la classe nom Société et le nombre d’employés
         */
        /**
         * personne tab[] = new personne[5]; int i; Scanner sc = new Scanner(System.in);
         * employe emp; for (i = 0; i < 4; i++) { System.out.println("employe " + (i +
         * 1) + " nom: "); String nom = sc.next(); System.out.println("prenom:"); String
         * prenom = sc.next(); System.out.println("annee de naissance:"); int nais =
         * sc.nextInt(); System.out.println("salaire:"); double salaire =
         * sc.nextDouble(); emp = new employe(nom, prenom, nais, salaire); tab[i] = emp;
         * } System.out.println("directeur nom: "); String nom = sc.next();
         * System.out.println("prenom:"); String prenom = sc.next();
         * System.out.println("annee de naissance:"); int nais = sc.nextInt();
         * System.out.println("salire:"); double salaire = sc.nextDouble();
         * System.out.println(" nom de societe :"); String noms = sc.next(); int nombre
         * = 4; societe s; s = new societe(); s.setnom(noms); s.setnombre(4);
         * 
         * directeur dir; dir = new directeur(nom, prenom, nais, salaire, s); tab[4] =
         * dir; for (i = 0; i < 5; i++) { tab[i].affiche(); }
         */
        /**
         * Une classe Personne qui comporte trois champs privés: nom, prénom, et date de
         * naissance. Cette classe comporte un constructeur pour permettre d’initialiser
         * les données. Elle comporte également une méthode polymorphe Afficher pour
         * afficher les données de chaque personne. Une classe employé qui dérive de la
         * classe Personne, avec en plus un champ Salaire accompagné de sa proporiété,
         * un constructeur et la redéfinition de la méthode Afficher. Une classe Chef
         * qui dérive de la classe Employé, avec en plus un champ Service accompagné de
         * sa propriété, un constructeur et la redéfinition de la méthode Afficher. 1.
         * Implémenter les classes Personne, Employé, et Chef. 2. Implémenter une classe
         * principale qui a) Créer un tableau de dix personnes avec 6 emplyés et 4
         * chefs. Les informations doivent être enseignées au clavier. b) Afficher
         * l’ensemble des personnes c) Afficher les employés dans le salaire est
         * supérieur à 45000 da
         */

        /**
         * Scanner sc = new Scanner(System.in); perchon tab[] = new perchon[10]; int i;
         * emploayouch emp; for (i = 0; i < 2; i++) { System.out.println("emploayouch "
         * + (i + 1)); System.out.println("nom :"); String nom = sc.next();
         * System.out.println("prenom:"); String prenom = sc.next();
         * System.out.println("date de naissance :"); String nais = sc.next();
         * System.out.println("salaire:"); double salaire = sc.nextDouble();
         * System.out.println("propriete :"); String pro = sc.next(); emp = new
         * emploayouch(nom, prenom, nais, salaire, pro); tab[i] = emp; } chefouch chef;
         * for (i = 2; i < 4; i++) { System.out.println("chefouch " + (i - 1));
         * System.out.println("nom :"); String nom = sc.next();
         * System.out.println("prenom:"); String prenom = sc.next();
         * System.out.println("date de naissance :"); String nais = sc.next();
         * System.out.println("salaire:"); double salaire = sc.nextDouble();
         * System.out.println("propriete :"); String pro = sc.next();
         * System.out.println("service :"); String service = sc.next(); chef = new
         * chefouch(nom, prenom, nais, salaire, pro, service); tab[i] = chef; }
         * System.out.println("tout les personnes :"); for (i = 0; i < 4; i++) {
         * tab[i].affiche(); System.out.println(); } System.out.println("les employés
         * dans le salaire est supérieur à 45000 da :"); double s; for (i = 0; i < 2;
         * i++) { emp = (emploayouch) tab[i]; s = emp.getsalaire(); if (s > 45000) {
         * tab[i].affiche(); } }
         */

    }
}
