package by.etc.basicsofoop.task2;


import java.util.List;

public class PaymentLogic {

    public void addItemToList(Payment payment, Payment.Item item){
        payment.getItemToBuy().add(item);
    }

    public void pay(List<Payment.Item> list) {
        double mon = totalPrice(list);

        System.out.println("All purchases are paid, total price is " + mon + "$.");
    }

    public double totalPrice(List<Payment.Item> list) {
        double price = 0;

        for (Payment.Item item: list) {
            price += item.getPrice();
        }

        return price;
    }
}
