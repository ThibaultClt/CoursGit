import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
//        List<Joueur> joueurs = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entrez le nombre de joueurs :");
//        int nombre = scanner.nextInt();
//        for(int i = 0; i < nombre; i++){
//            System.out.println("Entrez le nom du joueur " + (i+1) + " :");
//            String nom = scanner.nextLine();
//            Joueur joueur = new Joueur(nom);
//            System.out.println("Bienvenue joueur " + joueur.getNom());
//            joueurs.add(joueur);
//        }
//        Table_de_jeu jeu1 = new Table_de_jeu(joueurs);
//        jeu1.jouer();
//        System.out.println(jeu1);
        Table_de_jeu jeu = new Table_de_jeu();
        jeu.creer();
    }

}
