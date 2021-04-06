package com.example.javaexercise.lambdaFunctionalInterface;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.*;

public class LambdaFunctionalInterfaceExcercise {
    private static int[] age = {8, 22, 28, 29, 31, 30, 32};
    public static int maxNum(IntBinaryOperator operator){
        int r = age[0];
        for (int age : age) {
            r = operator.applyAsInt(r, age);
        }
        return r;
    }
    public static void main(String[] args) {

        /**
         * Function
         */
        // 하나 받고 결과 반환
        Function<String, Integer> f1 = (s) -> s.length();
        System.out.println(f1.apply("new String[]{}"));
        // 매개변수형 타입과 리턴 타입을 사용.
        Function<String, Boolean> f2 = s -> Integer.parseInt(s) != 1 ? true : false;
        boolean b = f2.apply("2");
        System.out.println(b);
        b = f2.apply("1");
        System.out.println(b);

        /**
         * Predicate
         */
        // 타입 Integer 매개변수를 받고 boolean 반환
        Predicate<Integer> p1 = (i) -> {
            return i > 20 || i < 100 ? true : false;
        };
        System.out.println(p1.test(123));
        System.out.println(p1.test(13));
        // 타입 String 정해진 매개변수를 받고 boolean 반환
        Predicate<String> p2 = (s) -> {
            return s.length() > 10 || s.charAt(1) != 'W' ? true : false;
        };
        System.out.println(p2.test("321"));
        System.out.println(p2.test("09"));

        /**
         * Consumer
         */
        // 하나의 매개변수 받고 반환 x
        Consumer<String> c1 = (t) -> System.out.println(t);
        c1.accept("먹기만 하는 소비자 김");
        // 타입이 정해진 매개변수만 받고 반환 x
        Consumer<Boolean> c2 = (bType) -> System.out.println(bType);
        c2.accept(true);

        /**
         * Supplier
         */
        Supplier<String> s1 = () -> {
            return "returned String";
        };
        System.out.println(s1.get());

        /**
         * BiFunction
         */
        BiFunction<Boolean, Boolean, String> bF = (aa1, aa2) -> {
            return aa1.toString() != aa2.toString() ? "좋아" : "싫어";
        };

        System.out.println(bF.apply(p1.test(30), p2.test("15")));

        /**
         * removeIf
         */
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("CHO");
        list.add("FOUR");

        list.removeIf(p2);
        System.out.println(list);

        /**
         * intBinaryOperator 매개변수로 사용해보기
         * max 구하는 resource는  https://blog.cornsworld.co.kr/318?category=755361
         * 내 생각으로 풀어보기 [배열]
         */
        int max = maxNum((l,r) -> {
            if(l >= r) return l;
            else return r;
        });
        System.out.println(max);
    }


}
