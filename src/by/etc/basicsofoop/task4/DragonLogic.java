package by.etc.basicsofoop.task4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DragonLogic {

    public void grab(Dragon dragon) {
        for (int i = 0; i < 100; i++) {
            Treasure treasure = new Treasure();

            treasure.setName("Treasure" + i);
            treasure.setPrice((int)(Math.random() * 100 + 1));

            dragon.getLair().getTreasures().add(treasure);
        }
    }

    public Treasure findMostValuableTreasure(Dragon dragon) {
        if (!dragon.getLair().getTreasures().isEmpty()) {
            Collections.sort(dragon.getLair().getTreasures());
        } else {
            System.out.println("Lair is empty!");
        }

        return dragon.getLair().getTreasures().get(dragon.getLair().getTreasures().size() - 1);
    }

    public void findTreasureOnSum(Dragon dragon, int val) {
        DragonView view = new DragonView();
        for (int i = 0; i < dragon.getLair().getTreasures().size(); i++) {

            if (dragon.getLair().getTreasures().get(i).getPrice() == val) {
                System.out.println("Treasure on sum " + val + " - " + view.printTreasure(dragon.getLair().getTreasures().get(i)));
            }

            if (dragon.getLair().getTreasures().get(i).getPrice() > val) {
                dragon.getLair().getTreasures().remove(i);
            }
        }

        List<Integer> testList = null;
        int sum = 0;

        for (int i = 0; i < dragon.getLair().getTreasures().size(); i++) {
            sum = dragon.getLair().getTreasures().get(i).getPrice();
            testList = new ArrayList<>();
            testList.add(i);

            for (int j = i + 1; j < dragon.getLair().getTreasures().size(); j++) {
                sum += dragon.getLair().getTreasures().get(j).getPrice();
                testList.add(j);

                if (sum == val) {
                    System.out.print("Treasure on sum " + val + " - ");
                    for (Integer tr : testList) {
                        System.out.print(view.printTreasure(dragon.getLair().getTreasures().get(tr)) + " | ");
                    }

                    System.out.println();

                    sum -= dragon.getLair().getTreasures().get(j).getPrice();
                    testList.remove(testList.size() - 1);
                }

                if (sum > val) {
                    sum -= dragon.getLair().getTreasures().get(j).getPrice();
                    testList.remove(testList.size() - 1);
                }
            }
        }
    }
}
