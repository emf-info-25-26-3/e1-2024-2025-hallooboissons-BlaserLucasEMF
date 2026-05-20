package app;



public class Commande {

    private String client;
    private Cageot[] cageots;
    private int nbCageots;
    public static final int MAX_CAGEOTS = 8;

    // constructeur
    public Commande(String client) {
        this.client = client;
        this.cageots = new Cageot[MAX_CAGEOTS];
        this.nbCageots = 0;
    }

    // demander le client
    public String getClient() {
        return client;
    }

    // ajouter un cageot
    public boolean ajouterCageot(Cageot c) {
        if (nbCageots < MAX_CAGEOTS) {
            cageots[nbCageots] = c;
            nbCageots++;
            return true;
        }
        return false; // trop de cageots
    }

    // enlever un cageot
    public boolean enleverCageot(Cageot c) {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null && cageots[i].equals(c)) {
                cageots[i] = null;
                nbCageots--;
                return true;
            }
        }
        return false;
    }

    // annuler la commande
    public void annuler() {
        for (int i = 0; i < cageots.length; i++) {
            cageots[i] = null;
        }
        nbCageots = 0;
    }

    // liste des cageots (sans null)
    public Cageot[] getCageots() {
        Cageot[] resultat = new Cageot[nbCageots];
        int j = 0;

        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                resultat[j] = cageots[i];
                j++;
            }
        }

        return resultat;
    }


    // prix total
    public double getPrixTotal() {
        double total = 0;

        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {

                Bouteille[] bouteilles = cageots[i].getBouteilles();

                for (int j = 0; j < bouteilles.length; j++) {
                    total += bouteilles[j].getPrix();
                }
            }
        }

        return total;
    }
}