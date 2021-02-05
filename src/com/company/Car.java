package com.company;

public class Car {

    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void checkEngine() {
        System.out.println("Вызвана функция диагностики двигателя");
    }

    public void startEngine() {
        System.out.println("Вызвана функция запуска двигателя");
    }

    public void stopEngine() {
        System.out.println("Вызвана функция остановки двигателя");
    }

    public class Door {

        private boolean stateDoor = false;

        public boolean getStateDoor() {
            return this.stateDoor;
        }

        public void openDoor() {
            if (!stateDoor) {
                System.out.println("Дверь открыта");
                this.stateDoor = !this.stateDoor;
            } else
                System.out.println("Дверь уже открыта");
        }

        public void closeDoor() {
            if (stateDoor) {
                System.out.println("Дверь закрыта");
                this.stateDoor = !this.stateDoor;
            } else
                System.out.println("Дверь уже закрыта");
        }
    }

    public static class Light {

        public void lightOn() {
            System.out.println("Вызвана функция включения света");
        }

        public void lightOff() {
            System.out.println("Вызвана функция выключения света");
        }
    }
}
