package behavioral.observer;

public class ClientVIP {
    private final String nom;

    ClientVIP(String nom) {
        this.nom = nom;
    }

    public void notification(Promotion promotion) {
        System.out.println(nom + " :" + promotion);
    }
}
