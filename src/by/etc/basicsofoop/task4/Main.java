package by.etc.basicsofoop.task4;


/**
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возомжность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
 * и выбора сокровищ на заданную сумму.
 */

public class Main {

    public static void main(String[] args) {
        DragonLogic logic = new DragonLogic();
        DragonView view = new DragonView();

        Dragon dragon = new Dragon("KingOfFire", 10000);
        Lair lair = new Lair("top_mount");

        dragon.setLair(lair);

        logic.grab(dragon);

        Treasure treasure = logic.findMostValuableTreasure(dragon);

        System.out.println("Most valuable treasure: ");
        view.printTreasure(treasure);

        logic.findTreasureOnSum(dragon, 80);
    }
}
