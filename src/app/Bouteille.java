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

    String prixFormate = String.format("%.2f", prix);

    String materiel;
    String etat;

    if (enverre) {
        materiel = "verre";
    } else {
        materiel = "plastique";
    }

    if (remplissage == 100.0) {
        etat = "pleine";
    } else if (remplissage > 0 && remplissage < 100.0) {
        etat = "entamée";
    } else {
        etat = "vide";
    }

    return "Bouteille '" + nom + "' de " + contenance + "L en " + materiel +
           " à " + prixFormate + " Frs - " + etat;
}


}

