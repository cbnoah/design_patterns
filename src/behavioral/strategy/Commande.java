package behavioral.strategy;

public class Commande {
    private final double prixCommande;
    private final double distanceKm;
    private final StrategieLivraison strategie;

    public Commande(double prixCommande, double distanceKm, StrategieLivraison strategie) {
        this.prixCommande = prixCommande;
        this.distanceKm = distanceKm;
        this.strategie = strategie;
    }

    public double calculerFraisLivraison() {
        return strategie.calculerFrais(distanceKm, prixCommande);
    }

    public double totalAvecLivraison() {
        return prixCommande + calculerFraisLivraison();
    }

    @Override
    public String toString() {
        return String.format("Commande{prix=%.2f€, distance=%.1fkm, mode=%s, frais=%.2f€, total=%.2f€}",
                prixCommande, distanceKm, strategie.toString(), calculerFraisLivraison(), totalAvecLivraison());
    }
}
