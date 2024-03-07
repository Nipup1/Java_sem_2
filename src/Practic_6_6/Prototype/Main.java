package Practic_6_6.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1(1);
        Prototype clonedPrototype1 = prototype1.clone();

        if (clonedPrototype1 instanceof ConcretePrototype1) {
            ConcretePrototype1 concretePrototype1 = (ConcretePrototype1) clonedPrototype1;
            System.out.println("Cloned Prototype1: " + concretePrototype1.getField1());
        }

        Prototype prototype2 = new ConcretePrototype2("proto");
        Prototype clonedPrototype2 = prototype2.clone();

        if (clonedPrototype2 instanceof ConcretePrototype2) {
            ConcretePrototype2 concretePrototype2 = (ConcretePrototype2) clonedPrototype2;
            System.out.println("Cloned Prototype2: " + concretePrototype2.getField2());
        }
    }
}