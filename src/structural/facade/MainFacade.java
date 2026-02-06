package structural.facade;

public class MainFacade {
    static void main(String[] args) {
        CommandeValidationFacade commandeValidationFacade = new CommandeValidationFacade();
        commandeValidationFacade.startDelivery();
    }
}
