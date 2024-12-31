import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) {
        try{
            Adder a = new Adder();
            // LocateRegistry.createRegistry(5000);
            Naming.rebind("example", a);
            System.out.println("Server ready");
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
