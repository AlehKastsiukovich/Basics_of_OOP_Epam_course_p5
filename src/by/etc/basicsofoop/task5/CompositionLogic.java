package by.etc.basicsofoop.task5;


public class CompositionLogic {

    public String checkName(Composition composition, String name) {
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

    public String checkWrapping(Composition composition, String wrap) {
        if (wrap.toLowerCase().matches(".*cello.*")) {
            return "Cellophane";
        } else if (wrap.toLowerCase().matches(".*paper.*")) {
            return "Paper";
        } else {
            return null;
        }
    }

    public void addFlowerToComposition(Composition composition, Flower flower) {
        composition.getFlowers().add(flower);
    }
}
