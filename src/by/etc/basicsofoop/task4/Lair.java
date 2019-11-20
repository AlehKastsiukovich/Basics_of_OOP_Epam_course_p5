package by.etc.basicsofoop.task4;

import java.util.ArrayList;
import java.util.List;

public class Lair {
    private String name;
    private List<Treasure> treasures = new ArrayList<>();

    public Lair(String name, List<Treasure> treasures) {
        this.name = name;
        this.treasures = treasures;
    }

    public Lair(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreasures(List<Treasure> list) {
        treasures = list;
    }
}
