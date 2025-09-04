package main;

import car.Car;


public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Black", "T 6391 OP", "Ferrari", 300, 200);
        
        car1.displayCar();
        
        System.out.println("\n");
        
        car1.startEngine();
        car1.Throttle();
        car1.Brake();
        car1.turnOnHeadLamp();
        car1.turnOfHeadLamp();
    }
    
}
