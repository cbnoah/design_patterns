package creational.builder;

import java.util.ArrayList;

public class Sandwich {
    private String pain;
    private String viande;
    private String fromage;
    private ArrayList<String> legumes;
    private String sauce;
    private Boolean grille;

    Sandwich(SandwichBuilder sandwichBuilder) {
        this.pain = sandwichBuilder.pain;
        this.viande = sandwichBuilder.viande;
        this.fromage = sandwichBuilder.fromage;
        this.legumes = sandwichBuilder.legumes;
        this.sauce = sandwichBuilder.sauce;
        this.grille = sandwichBuilder.grille;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "pain='" + pain + '\'' +
                ", viande='" + viande + '\'' +
                ", fromage='" + fromage + '\'' +
                ", legumes=" + legumes +
                ", sauce='" + sauce + '\'' +
                ", grille=" + grille +
                '}';
    }
}
