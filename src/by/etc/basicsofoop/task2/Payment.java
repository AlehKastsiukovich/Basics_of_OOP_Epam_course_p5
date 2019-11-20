package by.etc.basicsofoop.task2;


import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> itemToBuy = new ArrayList<>();

    public Payment() {

    }

    public Payment(List<Item> items) {
        itemToBuy = items;
    }

    public List<Item> getItemToBuy() {
        return itemToBuy;
    }

    public void setItemToBuy(List<Item> list) {
        itemToBuy = list;
    }


    class Item {
        private String itemName;
        private double price;

        public Item(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
