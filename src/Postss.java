import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Postss {
    static void main(String[] args) {
        String baseUri = "https://jsonplaceholder.typicode.com";
        String endpoint =  "/posts";

        URI uri = URI.create(baseUri + endpoint);
        Path path = Path.of("posts.json");

        try (InputStream inputStream = uri.toURL().openStream()){
            byte[] data = inputStream.readAllBytes();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
