package structural.adapter;

public class MainAdapter {
    static void main(String[] args) {
        LecteurCSV lecteurCSV = new LecteurCSV(System.getProperty("user.dir") + "/src/structural/adapter/ventes.csv");
        BurgerAnalytics analytics = new BurgerAnalytics(new CSVAdapter(lecteurCSV));
        analytics.genererRapport();
    }
}
