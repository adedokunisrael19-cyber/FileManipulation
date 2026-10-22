import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;

public class VideoRetrieval {
    static void main(String[] args) throws IOException {
        String videoUrl = "" ;
        URI uri = URI.create(videoUrl);
        try (InputStream inputStream = uri.toURL().openStream();
            FileOutputStream fileOutputStream =
                    new FileOutputStream("video.mp4");
            ) {
              byte[] bytes = inputStream.readAllBytes();
            System.out.println("raw video:" + Arrays.toString(bytes));
              fileOutputStream.write(bytes);
    }catch (IOException exception){
        exception.printStackTrace();
        }
    }
}
