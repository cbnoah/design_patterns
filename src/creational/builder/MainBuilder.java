package creational.builder;

import java.util.ArrayList;

public class MainBuilder {
    public static void main() {
        ArrayList<String> legumesList = new ArrayList<>();
        legumesList.add("laitue");
        legumesList.add("oignon");

        Sandwich sandwich1 = new SandwichBuilder()
                .pain("baguette")
                .viande("jambon")
                .fromage("cheddar")
                .legumes(legumesList)
                .build();
        System.out.println(sandwich1);

        Sandwich sandwich2 = new SandwichBuilder()
                .pain("ciabatta")
                .grille(true)
                .build();
        System.out.println(sandwich2);

        Sandwich sandwich3 = new SandwichBuilder()
                .pain("complet")
                .viande("poulet")
                .sauce("ketchup")
                .grille(false)
                .build();
        System.out.println(sandwich3);
    }
}
