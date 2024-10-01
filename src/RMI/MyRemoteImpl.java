package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;
    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "";
    }

    public static void main(String[] args) {
        try{
//            rmi://localhost/MyRemote
            MyRemote service =  new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
