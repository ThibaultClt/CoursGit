import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom;
    private List<Carte> main = new ArrayList<>();


    public Joueur(String nom) {
        this.nom = nom;
        this.main = new ArrayList<>();
    }

    public List<Carte> piocher(Paquet paquet){
        this.main = paquet.distribuer(5);
        return main;
    }

    @Override
    public String toString() {
        String cartes = "";
        for(int i = 0; i<main.size(); i++){
            cartes = cartes + main.get(i) +", ";
        }
        return "Joueur{" +
                "nom = '" + nom + '\'' +
                ", main = " + cartes +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Carte> getMain() {
        return main;
    }

    public void setMain(List<Carte> main) {
        this.main = main;
    }
}
