package behavioral.strategy;

public class ClickAndCollect implements StrategieLivraison {
    @Override
    public double calculerFrais(double distanceKm, double prixCommande) {
        return 0.0; // retrait sur place, pas de frais
    }

    @Override
    public String toString() {
        return "Click&Collect";
    }
}
