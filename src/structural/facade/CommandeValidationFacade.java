package structural.facade;

public class CommandeValidationFacade {
    private final UserConnexion userConnexion = new UserConnexion();
    private final IngredientsDisponibility ingredientsDisponibility = new IngredientsDisponibility();
    private final PreparationTime preparationTime = new PreparationTime();
    private final DeliveryManDisponibility deliveryManDisponibility = new DeliveryManDisponibility();
    private final AddressAreaVerification addressAreaVerification = new AddressAreaVerification();

    public void startDelivery() {
        userConnexion.isUserConnected();
        addressAreaVerification.isAddressInArea();
        ingredientsDisponibility.isIngredientAvailable();
        preparationTime.mealPrepTime();
        deliveryManDisponibility.isDeliveryManAvailable();
    }
}
