package behavioral.strategy;

public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFrais(double distanceKm, double prixCommande) {
        if (prixCommande >= 50.0) return 0.0; // livraison gratuite au-delà de 50€
        if (distanceKm <= 1.0) return 1.0;
        if (distanceKm <= 5.0) return 3.0;
        if (distanceKm <= 15.0) return 7.0;
        return 20.0;
    }

    @Override
    public String toString() {
        return "Livraison Standard";
    }
}
