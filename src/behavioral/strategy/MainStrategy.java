package behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Commande c1 = new Commande(25.0, 0.5, new ClickAndCollect());
        Commande c2 = new Commande(40.0, 4.0, new LivraisonStandard());
        Commande c3 = new Commande(60.0, 12.0, new LivraisonExpress());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
