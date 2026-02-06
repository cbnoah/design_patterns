package behavioral.observer;

public class MainObserver {
    static void main() {
        ClientVIP client1 = new ClientVIP("bob");
        ClientVIP client2 = new ClientVIP("bob2");
        ClientVIP client3 = new ClientVIP("bob3");


        BurgerFastRestaurant burgerFastRestaurant = new BurgerFastRestaurant();
        burgerFastRestaurant.addClient(client1);
        burgerFastRestaurant.addClient(client2);
        burgerFastRestaurant.addClient(client3);

        Promotion promotion = new Promotion("Nouvelle promotion", "description de la promotion", 20);
        burgerFastRestaurant.newNotification(promotion);
    }
}
