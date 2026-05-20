package app;

public class Cageot {

    public static final int NOMBRE_BOUTEILLE = 12;

    private String identifiant;
    private Bouteille[] cageot = new Bouteille[NOMBRE_BOUTEILLE];
    private int nbBouteilles;
   

    public Cageot(String identifiant) {
        this.identifiant = identifiant;
        this.nbBouteilles = 0;
    }

    public void ajouterBouteille(Bouteille bouteille){

        if (nbBouteilles < NOMBRE_BOUTEILLE){
            cageot[nbBouteilles] = bouteille;
            nbBouteilles++;
        }
        else {
            System.out.println("Le cageot est plein, impossible d'ajouter une bouteille.");
        }
    }

    
public boolean enleverBouteille(Bouteille bouteille) {
    for (int i = 0; i < cageot.length; i++) {
        if (cageot[i] != null && cageot[i].equals(bouteille)) {
            cageot[i] = null;
            return true;
        }
    }
    return false;
}



    public String getIdentifiant() {
        return identifiant;
    }

    public int getNbBouteilles() {
        return nbBouteilles;
    }

   
public Bouteille[] getBouteilles() {
    Bouteille[] resultat = new Bouteille[nbBouteilles];
    int j = 0;

    for (int i = 0; i < cageot.length; i++) {
        if (cageot[i] != null) {
            resultat[j] = cageot[i];
            j++;
        }
    }

    return resultat;
}



public String toString(){

   return "Le cageot" + identifiant + " contient " + nbBouteilles + "/" + NOMBRE_BOUTEILLE + " bouteilles :";
}

}
