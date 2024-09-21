package RMI2;

// Server code
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class KitchenServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("KitchenService", new KitchenServiceImpl());
            System.out.println("Kitchen server is ready!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}