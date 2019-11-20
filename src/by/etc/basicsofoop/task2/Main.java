package by.etc.basicsofoop.task2;


/**
 * Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
 * из нескольких товаров.
 */

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentLogic logic = new PaymentLogic();

        Payment.Item item1 = payment.new Item("Book", 30.0);
        Payment.Item item2 = payment.new Item("Toy", 10.0);
        Payment.Item item3 = payment.new Item("Food", 25.0);

        logic.addItemToList(payment, item1);
        logic.addItemToList(payment, item2);
        logic.addItemToList(payment, item3);

        logic.pay(payment.getItemToBuy());
    }
}
