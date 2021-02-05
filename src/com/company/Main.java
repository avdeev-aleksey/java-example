package com.company;

public class Main {

    public static void main(String[] args) {

        Car auto = new Car("red", "lada");
        System.out.println(auto.getColor());
        System.out.println(auto.getModel());
        auto.setColor("green");
        System.out.println(auto.getColor());
        auto.checkEngine();
        auto.startEngine();
        auto.stopEngine();

        Car.Door door = auto.new Door();
        System.out.println(door.getStateDoor());
        door.openDoor();
        door.openDoor();
        door.closeDoor();
        door.closeDoor();

        Car.Light light = new Car.Light();
        light.lightOn();
        light.lightOff();
    }
}
