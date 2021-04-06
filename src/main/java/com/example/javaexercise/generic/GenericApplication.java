package com.example.javaexercise.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

public class GenericApplication {

    public static void main(String[] args) {

        //로타입은 사용하면 안돼.
        //기존버전 호환을 위해서 남겨놓은거지 이것을 사용하게 하려고 만든게 아니야

        List<Integer> list = new ArrayList<>();
        list.add(1);

        Integer o = list.get(0);


        //generic 쓰는 이유는, 공통화, 타입의 안정성-> 컴파일타임시에 에러, 형변환의 귀찮음을 덜어준다(?)


    }

    class Box {

    }


}
