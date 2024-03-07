package Practic_6_6.Prototype;

public class ConcretePrototype1 extends Prototype {
    private int field1;

    public ConcretePrototype1(int field1) {
        this.field1 = field1;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(field1);
    }
}
