package by.etc.java.basicsofoop.task5;

public class Tulips extends Flower {

    public Tulips(String color) {
        super(color);
    }

    @Override
    public Tulips getFlower(String color) {
        return new Tulips(color);
    }
}
