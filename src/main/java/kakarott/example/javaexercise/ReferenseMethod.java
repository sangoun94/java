package kakarott.example.javaexercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReferenseMethod {
    /**
     * 메소드 참조
     * 2021.03.31
     * @param args
     */
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(30, 40, 50, 60, 70);
        list = new ArrayList<>(list);

        Consumer<List<Integer>> consumer = i -> Collections.reverse(i);
        consumer.accept(list);
        System.out.println(list);*/

        // 메소드 참조
        List<String> ls = new ArrayList<>();
        ls.add("30");
        ls.add("40");
        ls.add("50");

        Consumer<List<String>> consumer = Collections::reverse;
        System.out.println(ls);  //[30, 40, 50]
        consumer.accept(ls);
        System.out.println(ls);  //[50, 40, 30]
    }
}
