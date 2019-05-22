package me.syus.domain;

public class Bicycle extends Bike {
    int pedalNum;
    Bicycle(int wheelNum, int pedalNum, String seatShape) {
        this.pedalNum = pedalNum;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }
    public String toString() {
        return "I'm a bicycle. I have " + wheelNum + " wheels and " + pedalNum + " pedal. My seat shape is " + seatShape + "." ;
    }
}
