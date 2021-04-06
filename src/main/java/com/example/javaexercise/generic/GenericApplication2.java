package com.example.javaexercise.generic;


class GenericApplication2 {

    public static <T> void calAndShow(GenericInterface<T> op, T n1, T n2){
        T r = op.cal(n1, n2);
        System.out.println(r);
    }

    public static void main(String[] args) {
        GenericInterface<Integer> genericInterface = (a, b) -> a - b / 2;

        GenericApplication2.calAndShow(genericInterface, 12, 15);


    }
}
