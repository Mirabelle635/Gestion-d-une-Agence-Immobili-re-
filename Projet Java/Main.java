public class Main {
    public static void main(String[] args) {
        AgenceImmobiliere agence = new AgenceImmobiliere();

        // Ajouter des biens immobiliers
        BienImmobilier maison = new BienImmobilier("Maison", "123 Rue Principale", 250000);
        BienImmobilier appartement = new BienImmobilier("Appartement", "456 Avenue des Champs", 150000);
        agence.ajouterBien(maison);
        agence.ajouterBien(appartement);

        // Ajouter des clients
        client client1 = new client("Jean Dupont", "0123456789", "Acheteur");
        client client2 = new client("Marie Durand", "0987654321", "Vendeur");
        agence.ajouterClient(client1);
        agence.ajouterClient(client2);

        // Afficher les biens disponibles
        agence.afficherBiensDisponibles();

        // Afficher la liste des clients
        agence.afficherClients();
    }
}

