package Practic_1_6;

import java.time.LocalDate;

public class Main {

    @FunctionalInterface
    public interface Compartor<T>{
        boolean compare(T o1, T o2);
    }

    public static void main(String[] args) {
        Student stud1 = new Student(2, 34);
        Student stud2 = new Student(8, 54);

        Compartor<Student> comp = (o1, o2) -> (o1.getValue() > o2.getValue());

        if(comp.compare(stud1, stud2)){
            System.out.println("У первого больше!");
        } else{
            System.out.println("У второго больше!");
        }
    }
}
