package by.etc.basicsofoop.task4;

public class DragonView {

    public void printAllTreasures(Dragon dragon) {
        System.out.println("All treasures!");

        for (Treasure treasure : dragon.getLair().getTreasures()) {
            printTreasure(treasure);
        }
    }

    public String printTreasure(Treasure treasure) {
        return "treasure type: " + treasure.getName() + " price: " + treasure.getPrice();
    }
}
