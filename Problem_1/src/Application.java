import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException{
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {
            FileInputStream dataFile = new FileInputStream("problem1.txt");
            FileOutputStream outputFile = new FileOutputStream("unique_words.txt");

            duplicateRemover.remove(dataFile);
            duplicateRemover.write(outputFile);
        } catch (FileNotFoundException exception) {
            System.out.println("Caught FileNotFoundException: " + exception.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
