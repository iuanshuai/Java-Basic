package me.syus.homework.course3homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;


public class testClass {
    Logger l = LoggerFactory.getLogger(getClass());
    public void testMethod() {
        l.debug("running test method!");
        l.error("error test");
    }

    public static void main(String[] args) {
        testClass tc = new testClass();
        tc.testMethod();
    }

}
