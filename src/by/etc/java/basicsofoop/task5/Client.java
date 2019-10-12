package by.etc.java.basicsofoop.task5;


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

public class Client {
    private Composition composition;

    public void createNewComposition() {
        composition = new Composition();
    }

    public void getNewFlower() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter flower: ");
        String scanName = scanner.nextLine();
        String newFlower = composition.checkName(scanName);

        if (newFlower == null) {
            getNewFlower();
        }

        System.out.println("Enter color :");
        String color = scanner.nextLine();

        if (newFlower.equals("Rose")) {
            composition.addFlowerToComposition(new Rose(color));
        } else if (newFlower.equals("Tulips")) {
            composition.addFlowerToComposition(new Tulips(color));
        } else if (newFlower.equals("Aster")) {
            composition.addFlowerToComposition(new Aster(color));
        }
    }

    public void chooseWrapping() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of wrapping: ");
        String wrapScan = scanner.nextLine();
        String newWrap = composition.checkWrapping(wrapScan);

        if (newWrap == null) {
            chooseWrapping();
        }

        System.out.println("Enter color :");
        String color = scanner.nextLine();

        if (newWrap.equals("Cellophane")) {
            composition.setWrapping(new CellophaneWrapping(color));
        } else if (newWrap.equals("Paper")) {
            composition.setWrapping(new PaperWrapping(color));
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.createNewComposition();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of flowers.");
        int flowerNum = scanner.nextInt();
        for (int i = 0; i < flowerNum; i++) {
            client.getNewFlower();
        }

        client.chooseWrapping();
        client.composition.showComposition();
    }
}

