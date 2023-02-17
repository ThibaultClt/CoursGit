import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paquet {

    private List<Carte> tableauCarte = new ArrayList<>();

    public void remplir(){
        for(Valeur i : Valeur.values()){
            for(Couleur j : Couleur.values()){
                Carte carte = new Carte(i,j);
                tableauCarte.add(carte);
            }
        }
    }

    @Override
    public String toString() {
        String paquet = "Paquet de cartes :\n";
        for(int i = 0; i<tableauCarte.size(); i++){
            paquet = paquet + tableauCarte.get(i) +"\n";
        }
        return paquet;
    }

//    public void triValeur(List<Carte> tableauCarte){
//        for(int i = 0; i<tableauCarte.size(); i++){
//            if(tableauCarte.get(i).getValeur().getValeur() > tableauCarte.get(i + 1).getValeur().getValeur()){
//                if(tableauCarte.get(i).getValeur().compareTo(tableauCarte.get(i+1).getValeur()) < 0){
//                }
//            }
//        }
//    }

    public void melanger(){
        Collections.shuffle(tableauCarte);
    }

    public List<Carte> distribuer(int nombre){
        List<Carte> pioche = new ArrayList<>();
        for(int i = 0; i < nombre; i++){
            pioche.add(tableauCarte.get(0));
            tableauCarte.remove(tableauCarte.get(0));
        }
        return pioche;
    }



}
