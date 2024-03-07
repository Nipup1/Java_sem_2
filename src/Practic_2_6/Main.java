package Practic_2_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public String concat;

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public static void main(String[] args) {
        Human human1 = new Human(12, "Kolym", "Zharikov", LocalDate.of(2004,12,30), 43);
        Human human2 = new Human(14, "Stepan", "Kazakov", LocalDate.of(1998,12,23), 56);
        Human human3 = new Human(90, "Rudo", "Chakr", LocalDate.of(1999,2,2), 78);
        String concat = "";

        ArrayList<Human> my_arr = new ArrayList<>();

        my_arr.add(human1);
        my_arr.add(human2);
        my_arr.add(human3);

        Stream<Human> stream = my_arr.stream();
        Predicate<Human> predic = (Human o1) -> {
            LocalDate o_date = o1.birthDate;
            if(o_date.compareTo(LocalDate.of(1999, 2, 3)) > 0){
                return false;
            }else return true;
        };

        String s = stream.filter(o1 -> {
            o1.weight -= 5;
            return predic.test(o1);
        }).map(o1 -> {
            System.out.println(o1);;
            return o1.lastName;
        }).reduce("", (o1,  o2) -> (o1 + o2));
        System.out.println(s);
    }
}
