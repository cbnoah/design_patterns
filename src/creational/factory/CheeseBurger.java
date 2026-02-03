package creational.factory;

public class CheeseBurger implements Burger {
    private int prix;
    private String pain;
    private String viande;
    private String fromage;

    CheeseBurger() {
        this.prix = 10;
        this.pain = "pain sesame";
        this.viande = "steak haché";
        this.fromage = "cheddar fondu";
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "prix=" + prix +
                ", pain='" + pain + '\'' +
                ", viande='" + viande + '\'' +
                ", fromage='" + fromage + '\'' +
                '}';
    }
}
