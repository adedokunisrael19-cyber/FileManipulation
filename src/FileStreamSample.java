import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamSample {
    static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL LATITUDE 3400\\Desktop\\first_issue.txt";

        try( FileInputStream fileInputStream = new FileInputStream(fileLocation);) {
            byte [] fileContent = fileInputStream.readAllBytes();
            System.out.println(new String(fileContent));
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
