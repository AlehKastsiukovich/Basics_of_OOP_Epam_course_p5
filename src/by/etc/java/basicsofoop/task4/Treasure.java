package by.etc.java.basicsofoop.task4;

public class Treasure implements Comparable<Treasure> {
    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return name + "(" + price + "$)";
    }

    @Override
    public int compareTo(Treasure o) {

        int result = this.price.compareTo(o.price);

        if (result == 0) {
            result = this.name.compareTo(o.name);
        }

        return result;
    }
}
