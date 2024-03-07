package Practic_6_6.Prototype;

public class ConcretePrototype2 extends Prototype {
    private String field2;

    public ConcretePrototype2(String field2) {
        this.field2 = field2;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(field2);
    }
}
