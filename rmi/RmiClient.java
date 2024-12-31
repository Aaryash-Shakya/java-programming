import java.rmi.Naming;

public class RmiClient {
    public static void main(String[] args) {
        try {
            AdderInterface add = (AdderInterface) Naming.lookup("rmi://localhost:5000/example");
            int x = add.addNumber(10, 20);
            System.out.println("Sum: " + x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
