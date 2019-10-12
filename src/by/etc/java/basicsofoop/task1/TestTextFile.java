package by.etc.java.basicsofoop.task1;


import java.io.IOException;

/**
 * Создать объект класса Текстовый файл, использую классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class TestTextFile {

    public static void main(String[] args) {
        TextFiles textFiles = new TextFiles();
        //textFiles.createFile("d:\\testfile.txt");
        textFiles.initTextFile();
        textFiles.renameFile();
    }
}
