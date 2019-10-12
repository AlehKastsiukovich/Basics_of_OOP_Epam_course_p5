package by.etc.java.basicsofoop.task1;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFiles {
    private Path path;

    public void initTextFile() {
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
                createFile(scanner.nextLine());
            }
        } else {
            System.out.println("txt files in directory: " + textFiles.toString());
            System.out.println("Which file did you want to open?");
            path = Paths.get(scanner.nextLine());
        }
    }

    public void createFile(String stringPath) {
        try {
            path = Files.createFile(Paths.get(stringPath));
            System.out.println("File was created.");
        } catch (IOException e) {
            System.out.println("File does not create.");
        }
    }

    public void renameFile() {
        if (Files.exists(path)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new name of file: ");
            String newName = scanner.nextLine();

            try {
                Files.move(path, path.resolveSibling(newName));
            } catch (IOException e) {
                System.out.println("File does not renamed.");
            }

            System.out.println("File Renamed.");
        } else {
            System.out.println("File does not exist");
        }
    }

    public void displayContent() throws IOException {
        if (Files.exists(path)) {
            List<String> lines = Files.readAllLines(path);
            System.out.println("File contents: ");
            for (String ls : lines) {
                System.out.println(ls);
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    public void addSome() {
        if(Files.exists(path)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add text: ");
            String textAdd = scanner.nextLine();
            try(FileWriter fw = new FileWriter(path.toFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)){
                out.println(textAdd);
            }
            catch( IOException e ){
                e.printStackTrace();
            }

        } else {
            System.out.println("File does not exist.");
        }
    }

    public void deleteFile() throws IOException {
        if (Files.exists(path)) {
            Files.delete(path);
            System.out.println("File was deleted.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
