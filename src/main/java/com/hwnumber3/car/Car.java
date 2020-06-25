package main.java.com.hwnumber3.car;

public class Car {
    private int speed = 125

    public void startEngine() {
        System.out.println("The engine started, you can start to move");
    }

    public void stopEngine() {
        System.out.println("The engine is turned off");
    }

    public void move() {
        System.out.println("Car is moving");
    }

    public void tempo() {
        System.out.println("Current speed is " + speed);
    }
}
