import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order(1080, new Date(), OrderStatus.pendingPayment);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.delivered;

        OrderStatus os2 = OrderStatus.valueOf("delivered");

        System.out.println(os1);
        System.out.println(os2);

    }
}
