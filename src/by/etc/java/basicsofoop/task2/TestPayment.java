package by.etc.java.basicsofoop.task2;


import java.util.List;

/**
 * Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
 * из нескольких товаров.
 */

public class TestPayment {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Item item1 = payment.new Item("Book", 30.0);
        Payment.Item item2 = payment.new Item("Toy", 10.0);
        Payment.Item item3 = payment.new Item("Food", 25.0);

        payment.addItemToList(item1);
        payment.addItemToList(item2);
        payment.addItemToList(item3);

        List<Payment.Item> list = payment.getItemToBuy();
        payment.pay(list);

    }
}
