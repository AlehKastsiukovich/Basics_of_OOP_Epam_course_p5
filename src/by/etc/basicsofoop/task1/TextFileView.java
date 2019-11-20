package by.etc.basicsofoop.task1;


import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TextFileView {

    public void displayContent(TextFile textFile) {
        if (Files.exists(textFile.getPath())) {
            List<String> lines = null;

            try {
                lines = Files.readAllLines(textFile.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File contents: ");
            for (String ls : lines) {
                System.out.println(ls);
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
