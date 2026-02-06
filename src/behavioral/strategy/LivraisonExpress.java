package behavioral.strategy;

public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFrais(double distanceKm, double prixCommande) {
        if (prixCommande >= 50.0) return 0.0; // même règle de gratuité
        if (distanceKm <= 1.0) return 3.0;
        if (distanceKm <= 5.0) return 6.0;
        if (distanceKm <= 15.0) return 12.0;
        return 30.0;
    }

    @Override
    public String toString() {
        return "Livraison Express";
    }
}
