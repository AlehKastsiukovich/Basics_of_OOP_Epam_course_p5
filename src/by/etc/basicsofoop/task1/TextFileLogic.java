package by.etc.basicsofoop.task1;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileLogic {

    public void createFile(TextFile textFile, String stringPath) {
        try {
            textFile.setPath(Files.createFile(Paths.get(stringPath)));
            System.out.println("File was created.");
        } catch (IOException e) {
            System.out.println("File does not create.");
        }
    }

    public boolean renameFile(TextFile textFile, String newName) {
        if (Files.exists(textFile.getPath())) {
            try {
                Files.move(textFile.getPath(), textFile.getPath().resolveSibling(newName));
            } catch (IOException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean addText(TextFile textFile, String textAdd) {
        if (Files.exists(textFile.getPath())) {

            try (FileWriter fw = new FileWriter(textFile.getPath().toFile(), true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(textAdd);
            } catch (IOException e) {
                return false;
            }

            return true;

        } else {
            return false;
        }
    }

    public boolean deleteFile(TextFile textFile) throws IOException {
        if (Files.exists(textFile.getPath())) {
            Files.delete(textFile.getPath());
            return true;
        } else {
            return false;
        }
    }

    public void initTextFile(TextFile textFile) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        List<String> textFiles = new ArrayList<>();
        File dir = new File("d:\\");
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith((".txt"))) {
                textFiles.add(file.getName());
            }
        }

        if (textFiles.size() == 0) {
            System.out.println("Directory is empty. Do you want to create new file? y/n");
            String answer = scanner.nextLine();

            if (answer.equals("y")) {
                System.out.println("Create new file: ");
                createFile(textFile, scanner.nextLine());
            }
        } else {
            System.out.println("txt files in directory: " + textFiles.toString());
            System.out.println("Which file did you want to open?");
            textFile.setPath(Paths.get(scanner.nextLine()));
        }
    }
}
