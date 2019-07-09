package me.syus.homework.course3homework;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoTwo {

    @Autowired
    Company company;


    public static void main(String[] args) {

        DemoTwo demoTwo = new DemoTwo();
        System.out.println(demoTwo.company);

    }
}
