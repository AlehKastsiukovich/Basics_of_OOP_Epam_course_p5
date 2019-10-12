package by.etc.java.basicsofoop.task2;


import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> itemToBuy = new ArrayList<>();

    public List<Item> getItemToBuy() {
        return itemToBuy;
    }

    public void addItemToList(Item item){
        itemToBuy.add(item);
    }

    public void pay(List<Item> list) {
        double totalCost = 0;

        for(Item it: list) {
            System.out.println(it.toString());
            totalCost += it.price;
        }

        System.out.println("All purchases are paid, total price is " + totalCost + "$.");
    }

    class Item {
        private String itemName;
        private double price;

        public Item(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item name : " + itemName + "/ price: " + price + "$";
        }
    }
}
