import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//java.nio
public class FileCreation {
   public static void main(String[] args) {
        // defining the path to the point you want to work
       //unix - home/gamp/Desktop
       // windows - C:\\users\Desktop..

       //there are two types of path, the absolute and the relatiove
       //absolute includes everything including the rot folder(C:)
       //relative is a derived folder


      // String fileLocation = "C:\\Users\\DELL LATITUDE 3400\\Documents\\Programming\\phase_two";
      try {
          String fileLocation = "C:/Users/DELL LATITUDE 3400/Documents/Programming/phase_two/FileCreation.java";

          Path path = Paths.get(fileLocation);
          //2. USe a method of class files to work with the path
          Files.createFile(path);
      } catch (IOException exception) {
            exception.printStackTrace();
          System.err.println(exception.getMessage());
      }

//       System.out.println(path.getFileSystem());
//       System.out.println(path.isAbsolute());
//       System.out.println(path.getRoot());
//



    }
}
