package app;



public class Application {

    public static void main(String[] args) {
    
     Bouteille bouteille1 = new Bouteille("Coca-Cola", 1.5, 0.5, true);
     Bouteille bouteille2 = new Bouteille("Pepsi", 1.2, 1.0, false);
     Bouteille bouteille3 = new Bouteille("Fanta", 1.5, 1.0, false);
     Bouteille bouteille4 = new Bouteille("Sprite", 1.3, 0.5, true);


      Cageot cageot1 = new Cageot("AX840");
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille3);
        cageot1.ajouterBouteille(bouteille4);


    }

    public static void afficherCommande(Commande commande) {
    
     
if (commande != null) { // vérifier si c'est un objet

        System.out.println("------------------------------");

        System.out.println("Commande pour le client : " + commande.getClient());

        Cageot[] cageotsALivrer = commande.getCageots();

        System.out.println("La commande contient " + cageotsALivrer.length + " cageots");

        System.out.println("Le prix total de la commande est de " 
                + String.format("%.2f", commande.getPrixTotal()) + " Frs");
    }
}


    }

