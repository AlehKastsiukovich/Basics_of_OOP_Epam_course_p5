package by.etc.java.basicsofoop.task5;

public class Rose extends Flower {

    public Rose(String color) {
        super(color);
    }

    public Rose getFlower(String color) {
        return new Rose(color);
    }
}
