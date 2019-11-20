package by.etc.basicsofoop.task5;


import java.util.Scanner;

/**
 * Корректно спроектируйте и реализуйте предметную часть задачи.
 * Для создания объектов продумайте возможность пораждающих шаблонов проектирования.
 * Реализуйте проверку данных, но не на стороне клиента.
 * Для проверки можно использовать регулярные выражения
 * Меню выбора действия пользователя можно не реализовывать
 * Переопределите где нужно методы equals(), toString(), hashCode().
 * Вариант А. Цветочная композиция. Составляющие цветочную композицию - цветы, упаковка.
 */

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Alex");
        ClientLogic logic = new ClientLogic();
        ClientView view = new ClientView();

        logic.createNewComposition(client);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of flowers.");
        int flowerNum = scanner.nextInt();
        for (int i = 0; i < flowerNum; i++) {
            logic.getNewFlower(client);
        }

        logic.chooseWrapping(client);

        view.showComposition(client);
    }
}
