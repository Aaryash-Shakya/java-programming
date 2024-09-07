import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class URLToFile {
    public static void main(String[] args) {
        String urlString = "https://example.com"; // Replace with your URL
        String filePath = "output.txt"; // Replace with your desired file path

        try {
            URL url = new URI("https://www.example.com").toURL();
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            int i;
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            while ((i = stream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
