package main.java.com.hwnumber3;

import main.java.com.hwnumber3.car.Car;
import main.java.com.hwnumber3.circle.Circle;
import main.java.com.hwnumber3.classcount.ClassCounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Write radius of your circle");
            double radius = scan.nextDouble();
            Circle circle = new Circle(radius);
            circle.setArea(circle.calculateArea(circle.getRadius()));
            System.out.println("Area is " + circle.getArea());
        } catch (Exception e) {
            System.out.println("Not number, try next time.");
        }
        ClassCounter classCounter = new ClassCounter();
        classCounter.Counter();
        System.out.println("Amount of objects : " + classCounter.getCount());
        Car car = new Car();
        car.startEngine();
        car.move();
        car.tempo();
        car.stopEngine();
    }

}
