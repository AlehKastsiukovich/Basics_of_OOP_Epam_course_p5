package by.etc.java.basicsofoop.task4;

/**
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возомжность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
 * и выбора сокровищ на заданную сумму.
 */

public class TestDragon {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.grab();

        //dragon.showAllTreasure();

        System.out.println("Most valuable is " + dragon.findMostValuableTreasure());

        dragon.findTreasureOnSum();
    }
}
