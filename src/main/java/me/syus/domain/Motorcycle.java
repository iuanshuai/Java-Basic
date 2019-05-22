package me.syus.domain;

public class Motorcycle extends Bike {
    public int pedalNum;
    public int gasTank;
    public String motor;
    public String toString() {
        return "I'm motocycle, I have " + pedalNum + " pedal, " + gasTank + " gas tank. My motor is " + motor + " My seat shape is " + seatShape + ".";
    }
    Motorcycle(int pedalNum, int gasTank, String motor, String shape) {
        this.pedalNum = pedalNum;
        this.gasTank = gasTank;
        this.motor = motor;
        this.seatShape = shape;
    }
}
