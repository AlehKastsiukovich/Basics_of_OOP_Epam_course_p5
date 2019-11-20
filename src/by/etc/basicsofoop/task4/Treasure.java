package by.etc.basicsofoop.task4;


public class Treasure implements Comparable<Treasure> {
    private String name;
    private Integer price;

    public Treasure(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Treasure() {

    }

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

    @Override
    public int compareTo(Treasure o) {
        int result = this.price.compareTo(o.price);

        if (result == 0) {
            result = this.name.compareTo(o.name);
        }

        return result;
    }
}
