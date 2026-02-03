package creational.factory;

public class MainFactory {
    static void main() {
        Burger burger1 = new BurgerFactory().createBurger(BurgerType.BURGER_VEGGIE);
        System.out.println(burger1);
        Burger burger2 = new BurgerFactory().createBurger(BurgerType.CHEESE_BURGER);
        System.out.println(burger2);
        Burger burger3 = new BurgerFactory().createBurger(BurgerType.CHICKEN_BURGER);
        System.out.println(burger3);
    }
}
