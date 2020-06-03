package singleton;

public class SingletonApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("001", "Indomie");
        orderDetailService.save("001", "Sabun");
        orderDetailService.save("001", "Pepsoden");
    }
}