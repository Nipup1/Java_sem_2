package Practic_3_6;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final Lock lock = new ReentrantLock();
    private static volatile My_structures structures = new My_structures();

    public static void add_with_lock(){
        lock.lock();
        ArrayList<Integer> list = new ArrayList<>(structures.my_set);
        structures.my_set.add(list.get(list.size() - 1) + 1);
        lock.unlock();
    }

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
           for(int i = 0; i < 6; i++){
               add_with_lock();
           }
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 6; i++){
                add_with_lock();
            }
            System.out.println(structures.my_set);
        });

        one.start();
        two.start();
    }
}
