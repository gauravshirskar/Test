package com.company;

import java.util.*;

public class Main implements Comparable<Integer> {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    list.add(538);
    list.add(231);
    list.add(100);
    list.add(321);
    list.add(532);
//    Comparator<Integer> com = (o1, o2) -> {
//           return o1%10 > o2%10?1:-1;
//        };
       // Collections.sort(list);
        Collections.sort(list, (o1, o2) -> o1%10 > o2%10?1:-1);
       list.forEach(System.out::println);
//        for(Integer i: list){
//            System.out.println(i);
//        }

    }

    @Override
    public int compareTo(Integer o) {

        return 0;
    }
}