public enum Valeur {
    DEUX(2, "DEUX"), TROIS(3, "TROIS"), QUATRE(4,"QUATRE"), CINQ(5,"CINQ"), SIX(6,"CINQ"), SEPT(7,"SEPT"), HUIT(8,"HUIT"), NEUF(9,"NEUF"), DIX(10,"DIX"), VALET(11,"VALET"), DAME(12,"DAME"), ROI(13,"ROI"), AS(14,"AS");
    private int valeur;
    private String nom;

    Valeur(int valeur, String nom) {
        this.valeur = valeur;
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public String getNom() {
        return nom;
    }

}
