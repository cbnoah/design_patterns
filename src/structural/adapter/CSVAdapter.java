package structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(String nomFichier) {
        this.lecteur = new LecteurCSV(nomFichier);
    }

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;
        if (lecteur == null) return total;
        int nbLignes = lecteur.getNbLignes();
        for (int i = 1; i < nbLignes; i++) { // skip header
            String[] colonnes = safeGetColonnes(i);
            if (colonnes == null || colonnes.length <= 2) continue;
            double ca = parsePrixQuantite(colonnes[2]);
            total += ca;
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        if (lecteur == null) return 0;
        int nb = 0;
        int nbLignes = lecteur.getNbLignes();
        for (int i = 1; i < nbLignes; i++) {
            String[] colonnes = safeGetColonnes(i);
            if (colonnes == null || colonnes.length <= 2) continue;
            double ca = parsePrixQuantite(colonnes[2]);
            if (ca > 0.0) nb++;
        }
        return nb;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();
        if (lecteur == null) return caParProduit;
        int nbLignes = lecteur.getNbLignes();
        for (int i = 1; i < nbLignes; i++) {
            String[] colonnes = safeGetColonnes(i);
            if (colonnes == null || colonnes.length <= 2) continue;
            String produit = colonnes[1].trim();
            if (produit.isEmpty()) continue;
            double ca = parsePrixQuantite(colonnes[2]);
            if (ca <= 0.0) continue;
            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + ca);
        }
        return caParProduit;
    }

    private String[] safeGetColonnes(int index) {
        try {
            String[] cols = lecteur.getColonnes(index);
            return cols;
        } catch (Exception e) {
            return null;
        }
    }

    private double parsePrixQuantite(String s) {
        if (s == null) return 0.0;
        String v = s.trim().replace(',', '.');
        if (v.isEmpty()) return 0.0;
        try {
            String[] parts = v.split("[xX]");
            double prix = Double.parseDouble(parts[0].trim());
            int qte = 1;
            if (parts.length > 1) {
                String q = parts[1].trim();
                if (!q.isEmpty()) qte = Integer.parseInt(q);
            }
            return prix * qte;
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
