package creational.singleton;

public final class TPE {

    private static volatile TPE instance = null;

    public int getChiffre_daffaire() {
        return chiffre_daffaire;
    }

    private int chiffre_daffaire;

    private TPE() {
        this.chiffre_daffaire = 0;
    }

    public void add(int prix) {
        this.chiffre_daffaire += prix;
    }

    public void reset() {
        this.chiffre_daffaire = 0;
    }

    public static TPE getInstance() {
        if (TPE.instance == null) {
            synchronized (TPE.class) {
                if (TPE.instance == null) {
                    TPE.instance = new TPE();
                }
            }
        }
        return TPE.instance;
    }

}