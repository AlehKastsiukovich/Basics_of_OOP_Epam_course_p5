package by.etc.java.basicsofoop.task5;

public class Flower {
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getClass().getSimpleName() +"-"+ this.color;
    }

    public Flower getFlower(String color) {
        return new Flower(color);
    }
}
