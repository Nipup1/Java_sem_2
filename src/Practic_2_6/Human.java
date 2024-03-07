package Practic_2_6;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "{ Возраст: " + age + "; Имя: " + firstName +
                "; Фамилия: " + lastName + "; Дата рождения: " +
                birthDate + "; Вес: " + weight + " }";
    }
}
