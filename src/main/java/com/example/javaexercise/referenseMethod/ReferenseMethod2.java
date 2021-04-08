package com.example.javaexercise.referenseMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class ReferenseMethod2 {
    /**
     * 메소드 참조2
     * 2021.03.31
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 55);
        list = new ArrayList<>(list);

        JustSort js = new JustSort();

        Consumer<List<Integer>> consumer = l -> js.sort(l);
        System.out.println(list);       //[30, 40, 50]
        consumer.accept(list);
        System.out.println(list);       //[50, 40, 30]

        // 메소드 참조
        /*List<String> ls = new ArrayList<>();
        ls.add("30");
        ls.add("40");
        ls.add("50");

        Consumer<List<String>> consumer = Collections::reverse;
        System.out.println(ls);  //[30, 40, 50]
        consumer.accept(ls);
        System.out.println(ls);  //[50, 40, 30]*/
    }
}

class JustSort {
    public void sort(List<?> list){
        Collections.reverse(list);
    }
}
