package by.etc.basicsofoop.task4;


public class Dragon {
    private String name;
    private int age;
    private Lair lair;

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lair getLair() {
        return lair;
    }

    public void setLair(Lair lair) {
        this.lair = lair;
    }
}

