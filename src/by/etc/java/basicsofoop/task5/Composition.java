package by.etc.java.basicsofoop.task5;

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

    public String checkName(String name) {
        if (name.toLowerCase().matches(".*rose.*")) {
            return "Rose";
        } else if (name.toLowerCase().matches(".*tulip.*")) {
            return "Tulips";
        } else if (name.toLowerCase().matches(".*aster.*")) {
            return "Aster";
        } else {
            return null;
        }
    }

    public String checkWrapping(String wrap) {
        if (wrap.toLowerCase().matches(".*cello.*")) {
            return "Cellophane";
        } else if (wrap.toLowerCase().matches(".*paper.*")) {
            return "Paper";
        } else {
            return null;
        }
    }

    public void addFlowerToComposition(Flower flower) {
        flowers.add(flower);
    }

    public void showComposition() {
        System.out.print("Full composition is ");
        for (Flower f: flowers) {
            System.out.print(f.toString() + " * ");
        }

        System.out.println(wrapping.toString());
    }
}
