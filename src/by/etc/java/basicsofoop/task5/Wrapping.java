package by.etc.java.basicsofoop.task5;

public class Wrapping {
    private String color;

    public Wrapping(String color) {
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
}
