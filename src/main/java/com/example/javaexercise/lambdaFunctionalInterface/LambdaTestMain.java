package com.example.javaexercise.lambdaFunctionalInterface;

import java.util.function.*;

public class LambdaTestMain {
    public static void main(String[] args) {
        /**
         * Lambda
         * 2021.03.30
         */

        // anonymous CLASS
        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("1,2,3");
                System.out.println("3,2,1");
            }
        };

        // lambda
        Runnable b = () -> {
            System.out.println("1,2,3");
            System.out.println("3,2,1");
        };
        Function c=  (s) -> {
            return 3;
        };
/*
        Function<String, Integer> c = (s) -> {
            return  3;
        };*/

        //메소드 참조 메소드 줄이는거가 있고, 생성자 줄이는거
        //메소드 줄이는거는 3가지 정도가 있어

        //static
        //인스턴스메소드
        //특정 객체의 인스턴스메소드

        RefTest ref = new RefTest();

        Runnable rr = () -> RefTest.staticTest();
        Runnable r = RefTest::staticTest;
        r.run();

        Runnable rr2 = () -> ref.test();
        Runnable r2 = ref::test;
        r2.run();

        Consumer<RefTest> rr3 = (reff) -> reff.test();
        Consumer<RefTest> r3 = RefTest::test;
        r3.accept(new RefTest());

        //느낌상 두개
        //기본생성자, 그외의 생성자(매개변수 받는거)
        Supplier<ConsTest> ss = () -> new ConsTest();
        Supplier<ConsTest> ssa = ConsTest::new;
        ConsTest consTest = ssa.get();

        Function<String, ConsTest> ss2 = sss -> new ConsTest(sss);
        Function<String, ConsTest> ssa2 = ConsTest::new;
        ConsTest s = ssa2.apply("s");

        BiFunction<String, String, ConsTest> ss3 = (sss, sss2) -> new ConsTest(sss, sss2);
        BiFunction<String, String, ConsTest> ssa3 = ConsTest::new;
        ConsTest s2 = ssa3.apply("s", "s2");

        System.out.println("consTest = " + consTest);
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        BiPredicate<String, String> p = String::equals;

        String a22 = "";
        Predicate<String> pp = a22::equals;

        Function<String, Integer> s1324 = Integer::parseInt;

        BiPredicate<String, String> p22 = (z, x) -> z.equals(x);
        Function<String, Integer> s1322 = (sasd) ->Integer.parseInt(sasd);



    }
}
class RefTest {
    public void test() {

    }
    public static void staticTest() {

    }
}

class ConsTest {
    String s;
    String s2;

    public ConsTest() {
    }

    public ConsTest(String s) {
        this.s = s;
    }

    public ConsTest(String s, String s2) {
        this.s = s;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "ConsTest{" +
                "s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}