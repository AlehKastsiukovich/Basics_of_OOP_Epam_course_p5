package by.etc.basicsofoop.task1;


import java.io.IOException;

/**
 * Создать объект класса Текстовый файл, использую классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile();
        TextFileLogic logic = new TextFileLogic();
        TextFileView view = new TextFileView();

        String text = "EPAM course part 5";

        logic.createFile(textFile, "d:\\kaffka.txt");
        logic.addText(textFile, text);
        view.displayContent(textFile);
        logic.renameFile(textFile, "d:\\hello.txt");

        logic.deleteFile(textFile);

    }
}
