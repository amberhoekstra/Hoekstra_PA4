import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    /*


    Create a separate class called Application that contains a main method which
    illustrates the use of DuplicateCounter by calling both the remove and write methods.
    Your input file must be called problem2.txt and your output file must be called
    unique_word_counts.txt. You will not receive credit if you use different file names,
    as my graders will not modify your code to make it work with their test files.

    Your program should work on any text file. The TA's will provide their own version of
    problem1.txt when they run your code.


*/

    private HashMap<String, Integer> wordCounter;

    void remove(FileInputStream dataFile) throws IOException {
        if (dataFile != null) {
            wordCounter = new HashMap<String, Integer>();
            String word;

            Scanner inFS = new Scanner(dataFile);
            while (inFS.hasNext()) {
                word = inFS.next().toLowerCase();
                if(wordCounter.containsKey(word)) {
                    wordCounter.put(word, wordCounter.get(word) + 1);
                } else {
                    wordCounter.put(word, 1);
                }
            }
            dataFile.close();
        }
    }

    void write(FileOutputStream outputFile) throws IOException {
        PrintWriter outFS = new PrintWriter(outputFile);

        for (HashMap.Entry<String, Integer> entry : wordCounter.entrySet()) {
            outFS.println(entry.getKey() + " " + entry.getValue());
        }
        outFS.flush();
        outputFile.close();
    }
}




