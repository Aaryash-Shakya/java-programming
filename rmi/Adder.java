import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

interface AdderInterface extends Remote {
    public int addNumber(int a, int b) throws RemoteException;
}

public class Adder extends UnicastRemoteObject implements AdderInterface {
    public Adder() throws RemoteException {
        super();
    }

    public int addNumber(int a, int b) {
        return a + b;
    }
}
