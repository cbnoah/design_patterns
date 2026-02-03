package creational.factory;

public class ChickenBurger implements Burger {
    private int prix;
    private String pain;
    private String viande;
    private String sauce;

    ChickenBurger() {
        this.prix = 9;
        this.pain = "pain burger";
        this.viande = "poulet pané croustillant";
        this.sauce = "sauce BBQ";
    }

    @Override
    public String toString() {
        return "ChickenBurger{" +
                "prix=" + prix +
                ", pain='" + pain + '\'' +
                ", viande='" + viande + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
