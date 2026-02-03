package creational.factory;

public class BurgerVeggie implements Burger {
    private int prix;
    private String pain;
    private String crudite;
    private String legume1;
    private String legume2;

    BurgerVeggie() {
        this.prix = 8;
        this.pain = "pain complet";
        this.crudite = "salade";
        this.legume1 = "tomate";
        this.legume2 = "carotte";
    }

    @Override
    public String toString() {
        return "BurgerVeggie{" +
                "prix=" + prix +
                ", pain='" + pain + '\'' +
                ", crudite='" + crudite + '\'' +
                ", legume1='" + legume1 + '\'' +
                ", legume2='" + legume2 + '\'' +
                '}';
    }
}
