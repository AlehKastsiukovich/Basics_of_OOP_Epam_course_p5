package by.etc.basicsofoop.task5;


public class Aster extends Flower {

    public Aster(String color) {
        super(color);
    }

    @Override
    public Aster getFlower(String color) {
        return new Aster(color);
    }
}
