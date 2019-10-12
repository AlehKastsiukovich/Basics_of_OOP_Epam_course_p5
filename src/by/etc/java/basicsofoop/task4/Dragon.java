package by.etc.java.basicsofoop.task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Dragon {

    public void grab() {
        for (int i = 0; i < 100; i++) {
            Treasure treasure = new Treasure();
            treasure.setName("Treasure" + i);
            treasure.setPrice((int)(Math.random() * 100 + 1));

            Lair.list.add(treasure);
        }
    }

    public void showAllTreasure() {
        System.out.println("All treasure!");

        for (Treasure tr : Lair.list) {
            System.out.println(tr.toString());
        }
    }

    public Treasure findMostValuableTreasure() {
        if (!Lair.list.isEmpty()) {
            Collections.sort(Lair.list);
        } else {
            System.out.println("Lair is empty!");
        }

        return Lair.list.get(Lair.list.size()-1);
    }

    public void findTreasureOnSum() {
        Scanner scanner = null;
        int number = 0;

        try {
            scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter sum of treasure: ");
                number = scanner.nextInt();

                if (number >= 0) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < Lair.list.size(); i++) {

            if (Lair.list.get(i).getPrice() == number) {
                System.out.println("Treasure on sum " + number + " - " + Lair.list.get(i).toString());
            }

            if (Lair.list.get(i).getPrice() > number) {
                Lair.list.remove(i);
            }
        }

        List<Integer> testList = null;
        int sum = 0;

        for (int i = 0; i < Lair.list.size(); i++) {
            sum = Lair.list.get(i).getPrice();
            testList = new ArrayList<>();
            testList.add(i);

            for (int j = i + 1; j < Lair.list.size(); j++) {
                sum += Lair.list.get(j).getPrice();
                testList.add(j);

                if(sum == number) {
                    System.out.print("Treasure on sum " + number + " - ");
                    for(Integer tr: testList) {
                        System.out.print(Lair.list.get(tr) +"/ " );
                    }

                    System.out.println();

                    sum -= Lair.list.get(j).getPrice();
                    testList.remove(testList.size() - 1);
                }

                if (sum > number) {
                    sum -= Lair.list.get(j).getPrice();
                    testList.remove(testList.size() - 1);
                }
            }
        }
    }
}

