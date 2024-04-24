package Practic_7_6.LightWeight;

public class Stydent {
    private int age;
    private String name;
    private TypeStydent isStyde;

    public Stydent(int age, String name, TypeStydent isStyde) {
        this.age = age;
        this.name = name;
        this.isStyde = isStyde;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + isStyde.isStyde;
    }
}
