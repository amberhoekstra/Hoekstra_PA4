import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

class DuplicateRemover {

    private HashSet<String> uniqueWords;

    void remove(FileInputStream dataFile) throws IOException {
        if (dataFile != null) {
            uniqueWords = new HashSet<String>();

            Scanner inFS = new Scanner(dataFile);
            while (inFS.hasNext()) {
                uniqueWords.add(inFS.next().toLowerCase());
            }
            dataFile.close();
        }
    }

    void write(FileOutputStream outputFile) throws IOException {
        PrintWriter outFS = new PrintWriter(outputFile);

        for (String word : uniqueWords) {
            outFS.println(word);
        }
        outFS.flush();
        outputFile.close();
    }
}

