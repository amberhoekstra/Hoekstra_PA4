import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        try {
            FileInputStream dataFile = new FileInputStream("problem2.txt");
            FileOutputStream outputFile = new FileOutputStream("unique_word_counts.txt");

            duplicateCounter.remove(dataFile);
            duplicateCounter.write(outputFile);
        } catch (FileNotFoundException exception) {
            System.out.println("Caught FileNotFoundException: " + exception.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
