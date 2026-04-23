package app;

public class Bouteille {

    private String nom;
    private double prix;
    private double contenance;
    private double remplissage;
    private boolean enverre;

    public Bouteille(String nom, double prix, double contenance, boolean enverre) {

        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = 100.0;
        this.enverre = enverre;

    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public boolean isEnverre() {
        return enverre;
    }

    public String toString() {

        String materiel;
        String videOuPlein;

        if (enverre == true) {
            materiel = "verre";
        }

        else {
            materiel = "plastique";
        }

        if(remplissage == 100.0){
            videOuPlein = "pleine";
        }

        else if(remplissage > 0 && remplissage < 100.0){
            videOuPlein = "entamée";
        }

        else{

            videOuPlein = "vide";
        }

        

        String afficher = "Bouteille" + nom + "de" + contenance + "en" + enverre + "à" + prix + "-" + remplissage;

return afficher;

    }

}
