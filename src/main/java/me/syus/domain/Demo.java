package me.syus.domain;

public class Demo {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        System.out.println(b1);
        Motorcycle m1 = new Motorcycle(2, 2, "aaa", "Round");
        System.out.println(m1);
        Bicycle bi1 = new Bicycle(2, 2, "Round");
        System.out.println(bi1);
    }
}
