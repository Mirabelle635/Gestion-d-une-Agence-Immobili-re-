import java.util.ArrayList;
import java.util.List;

public class AgenceImmobiliere {
    private List<BienImmobilier> biens;
    private List<client> client;

    public AgenceImmobiliere() {
        this.biens = new ArrayList<>();
        this.client = new ArrayList<>();
    }

    public void ajouterBien(BienImmobilier bien) {
        biens.add(bien);
    }

    public void ajouterClient(Client client) {
        client.add(client);
    }

    public void afficherBiensDisponibles() {
        System.out.println("Biens disponibles :");
        for (BienImmobilier bien : biens) {
            if (bien.isDisponible()) {
                System.out.println(bien);
            }
        }
    }

    public void afficherClients() {
        System.out.println("Liste des clients :");
        for (Client client : client) {
            System.out.println(client);
        }
    }
}

    

