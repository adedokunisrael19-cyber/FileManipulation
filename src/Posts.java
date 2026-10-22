import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Posts {
    static void main(String[] args) {

        String link = "https://jsonplaceholder.typicode.com/posts/1";
        URI uri = URI.create(link);

        try(InputStream inputStream = uri.toURL().openStream();){
            String fileLocation = "C:/Users/DELL LATITUDE 3400/Documents/Programming/phase_two/Post.java";
            Path path = Paths.get(fileLocation);


            byte[] Post = inputStream.readAllBytes();
            Files.write(path, Post);
        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
