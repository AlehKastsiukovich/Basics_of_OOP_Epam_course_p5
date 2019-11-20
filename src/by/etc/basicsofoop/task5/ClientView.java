package by.etc.basicsofoop.task5;


public class ClientView {

    public void showComposition(Client client) {
        System.out.print("Full composition is ");

        for (Flower flower: client.getComposition().getFlowers()) {
            System.out.print(flower.toString() + " * ");
        }

        System.out.println(client.getComposition().getWrapping());
    }
}
