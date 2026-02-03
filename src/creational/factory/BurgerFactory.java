package creational.factory;

public class BurgerFactory {

    public Burger createBurger(BurgerType type) {
        return switch (type) {
            case BURGER_VEGGIE -> new BurgerVeggie();
            case CHEESE_BURGER -> new CheeseBurger();
            case CHICKEN_BURGER -> new ChickenBurger();
        };
    }
}
