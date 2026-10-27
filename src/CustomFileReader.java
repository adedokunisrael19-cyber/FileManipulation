import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {
    static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL LATITUDE 3400\\Desktop\\first_issue.txt";
        try (FileReader fileReader = new FileReader(fileLocation)){
            String fileContent = fileReader.readAllAsString();
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
