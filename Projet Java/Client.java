
    private String nom;
    private String telephone;
    private String typeClient;

    public Client(String nom, String telephone, String typeClient) {
        this.nom = nom;
        this.telephone = telephone;
        this.typeClient = typeClient;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getTypeClient() {
        return typeClient;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Téléphone: " + telephone + ", Type de client: " + typeClient;
    }
}
 
