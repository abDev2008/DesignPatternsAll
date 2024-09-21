package RMI2;

// Implement the remote service
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class KitchenServiceImpl extends UnicastRemoteObject implements KitchenService {
    protected KitchenServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String orderFood(String food) throws RemoteException {
        // Kitchen logic to prepare food
        return "Your " + food + " is ready!";
    }
}