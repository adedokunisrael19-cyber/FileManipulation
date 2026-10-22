import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//java.nio

public class FileWrite {
    public static void main(String[] args) {


        try {
            String fileLocation = "C:/Users/DELL LATITUDE 3400/Documents/Programming/phase_two/FileCreation.java";

            Path path = Paths.get(fileLocation);
            //2. USe a method of class files to work with the path
            String quote = "i'm happy";
            byte[] encoded = quote.getBytes();
            Files.write(path, encoded);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

//       System.out.println(path.getFileSystem());
//       System.out.println(path.isAbsolute());
//       System.out.println(path.getRoot());
    }
}
