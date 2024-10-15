public class BienImmobilier {
    private String type;
    private String adresse;
    private double prix;
    private boolean estDisponible;

    public BienImmobilier(String type, String adresse, double prix) {
        this.type = type;
        this.adresse = adresse;
        this.prix = prix;
        this.estDisponible = true;
    }

    // Getters et setters
    public String getType() {
        return type;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isDisponible() {
        return estDisponible;
    }

    public void setDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Adresse: " + adresse + ", Prix: " + prix + ", Disponible: " + estDisponible;
    }
}
