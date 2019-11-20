package by.etc.basicsofoop.task5;

import java.util.Scanner;

public class ClientLogic {

    public void createNewComposition(Client client) {
        Composition composition = new Composition();
        client.setComposition(composition);
    }

    public void getNewFlower(Client client) {
        CompositionLogic logic = new CompositionLogic();

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter flower: ");
        String scanName = scanner.nextLine();
        String newFlower = logic.checkName(client.getComposition(), scanName);

        if (newFlower == null) {
            getNewFlower(client);
        }

        System.out.println("Enter color :");
        String color = scanner.nextLine();

        if (newFlower.equals("Rose")) {
           logic.addFlowerToComposition(client.getComposition(), new Rose(color));
        } else if (newFlower.equals("Tulips")) {
            logic.addFlowerToComposition(client.getComposition(), new Tulips(color));
        } else if (newFlower.equals("Aster")) {
            logic.addFlowerToComposition(client.getComposition(), new Aster(color));
        }
    }

    public void chooseWrapping(Client client) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        CompositionLogic logic = new CompositionLogic();

        System.out.println("Enter type of wrapping: ");
        String wrapScan = scanner.nextLine();
        String newWrap = logic.checkWrapping(client.getComposition(), wrapScan);

        if (newWrap == null) {
            chooseWrapping(client);
        }

        System.out.println("Enter color :");
        String color = scanner.nextLine();

        if (newWrap.equals("Cellophane")) {
            client.getComposition().setWrapping(new CellophaneWrapping(color));
        } else if (newWrap.equals("Paper")) {
            client.getComposition().setWrapping(new PaperWrapping(color));
        }
    }
}
