package app;

public class Cageot {

    public static final int NOMBRE_BOUTEILLE = 12;

    private String identifiant;
    private Bouteille[] cageot = new Bouteille[NOMBRE_BOUTEILLE];

    public Cageot(String identifiant) {
        this.identifiant = identifiant;

    }

    public String getIdentifiant() {
        return identifiant;
    }

}