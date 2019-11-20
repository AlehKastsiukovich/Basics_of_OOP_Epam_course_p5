package by.etc.basicsofoop.task5;


import java.util.ArrayList;
import java.util.List;

public class Composition {
    private List<Flower> flowers = new ArrayList<>();
    private Wrapping wrapping;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }
}
