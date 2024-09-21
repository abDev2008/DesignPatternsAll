package RMI2;

// Define the interface for the remote service
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface KitchenService extends Remote {
    String orderFood(String food) throws RemoteException;
}