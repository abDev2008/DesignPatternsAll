package RMI2;

// Client code
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RestaurantClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            KitchenService kitchenService = (KitchenService) registry.lookup("KitchenService");

            String food = "Pizza";
            String result = kitchenService.orderFood(food);
            System.out.println("Received from kitchen: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}