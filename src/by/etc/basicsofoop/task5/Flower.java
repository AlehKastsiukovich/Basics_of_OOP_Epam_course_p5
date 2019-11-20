package by.etc.basicsofoop.task5;


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

    public Flower getFlower(String color) {
        return new Flower(color);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Flower flower = (Flower) object;
        if (color != flower.color)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }


    public String toString() {
        return getClass().getSimpleName() +"-"+ this.color;
    }
}
