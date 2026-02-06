package behavioral.observer;

public class Promotion {
    private String nom;
    private String description;
    private int pourcentage;

    public Promotion(String nom, String descrition, int pourcentage) {
        this.nom = nom;
        this.description = descrition;
        this.pourcentage = pourcentage;
    }

    @Override
    public String toString() {
        return nom + " : " + description + "\nPromotion de : " + pourcentage + "%";
    }
}
