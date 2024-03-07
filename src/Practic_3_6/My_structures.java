package Practic_3_6;

import java.util.*;

public class My_structures {
    public volatile Set<Integer> my_set;
    public volatile Map<Integer, Integer> my_map;

    public My_structures() {
        this.my_set = new HashSet<>();
        this.my_map = new HashMap<>();
        this.my_set.addAll(List.of(1, 2 , 3 ,4, 5, 6));
    }
}
