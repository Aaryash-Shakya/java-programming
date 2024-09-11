import java.net.*;

public class UrlConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URI("https://www.example.com").toURL();

            // Open a connection to the URL
            URLConnection conn = url.openConnection();

            // Get and display some information about the URL connection
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());
            System.out.println("Content Encoding: " + conn.getContentEncoding());
            System.out.println("Date: " + conn.getDate());
            System.out.println("Expiration: " + conn.getExpiration());
            System.out.println("Last Modified: " + conn.getLastModified());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
