import java.io.*;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
            dOut.writeUTF("Hello Server");
            dOut.flush();
            dOut.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
