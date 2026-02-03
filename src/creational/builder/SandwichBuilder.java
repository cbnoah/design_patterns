package creational.builder;

import java.util.ArrayList;

public class SandwichBuilder {
    String pain;
    String viande;
    String fromage;
    ArrayList<String> legumes;
    String sauce;
    Boolean grille;

    private static final String DEFAULT_VIANDE = "aucune";
    private static final String DEFAULT_FROMAGE = "aucune";
    private static final ArrayList<String> DEFAULT_LEGUMES = new ArrayList<>();
    private static final String DEFAULT_SAUCE = "aucune";
    private static final Boolean DEFAULT_GRILLE = false;

    public SandwichBuilder pain(String pain) {
        this.pain = pain;
        return this;
    }

    public SandwichBuilder viande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder fromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder legumes(ArrayList<String> legumes) {
        this.legumes = legumes;
        return this;
    }

    public SandwichBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder grille(boolean grille) {
        this.grille = grille;
        return this;
    }

    public Sandwich build() {
        if (this.viande == null) this.viande = DEFAULT_VIANDE;
        if (this.fromage == null) this.fromage = DEFAULT_FROMAGE;
        if (this.legumes == null) this.legumes = DEFAULT_LEGUMES;
        if (this.sauce == null) this.sauce = DEFAULT_SAUCE;
        if (this.grille == null) this.grille = DEFAULT_GRILLE;
        return new Sandwich(this);
    }
}
