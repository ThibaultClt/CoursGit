import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table_de_jeu {

    Paquet paquet = new Paquet();
    List<Joueur> joueurs = new ArrayList<>();

    public Table_de_jeu() {
        this.paquet = paquet;

    }

    public void creer(){
        List<Joueur> joueurs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de joueurs :");
        int nombre = scanner.nextInt();
        for(int i = 0; i < nombre; i++){
            System.out.println("Entrez le nom du joueur " + (i+1) + " :");
            String nom = scanner.nextLine();
            Joueur joueur = new Joueur(nom);
            System.out.println("Bienvenue joueur " + joueur.getNom());
            joueurs.add(joueur);
        }
//        Table_de_jeu jeu1 = new Table_de_jeu(joueurs);
        this.jouer();
    }

    public void jouer(){
        if(joueurs.size() >= 2){
            paquet.remplir();
            paquet.melanger();
            for(int i = 0; i < joueurs.size(); i++){
                joueurs.get(i).piocher(paquet);
            }
        }
        else{

        }
    }

    @Override
    public String toString() {
        return "Table_de_jeu{" +
                ", joueurs=" + joueurs +
                '}';
    }
}
