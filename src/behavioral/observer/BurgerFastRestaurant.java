package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private final List<ClientVIP> clientVIPList = new ArrayList<>();

    public void addClient(ClientVIP clientVIP){
        this.clientVIPList.add(clientVIP);
    }

    public void newNotification(Promotion promotion) {
        for (ClientVIP client : clientVIPList) {
            client.notification(promotion);
        }
    }
}
