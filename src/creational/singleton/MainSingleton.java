// java
package creational.singleton;

public class MainSingleton {

    public static void main() throws InterruptedException {
        Runnable caissier1 = () -> {
            TPE tpe = TPE.getInstance();
            tpe.add(10);
            tpe.add(5);
        };

        Runnable caissier2 = () -> {
            TPE tpe = TPE.getInstance();
            tpe.add(20);
            tpe.add(15);
        };

        Runnable caissier3 = () -> {
            TPE tpe = TPE.getInstance();
            tpe.add(30);
            tpe.add(10);
        };

        Thread[] caissiers = {
                new Thread(caissier1, "Caissier-1"),
                new Thread(caissier2, "Caissier-2"),
                new Thread(caissier3, "Caissier-3")
        };

        for (Thread t : caissiers) t.start();
        for (Thread t : caissiers) t.join();

        TPE tpe = TPE.getInstance();
        System.out.println("Total fin de journée: " + tpe.getChiffre_daffaire());

        tpe.reset();
        System.out.println("Après reset (nouvelle journée): " + tpe.getChiffre_daffaire());

        tpe.add(50);
        System.out.println("Après une transaction nouvelle journée: " + tpe.getChiffre_daffaire());
    }
}
