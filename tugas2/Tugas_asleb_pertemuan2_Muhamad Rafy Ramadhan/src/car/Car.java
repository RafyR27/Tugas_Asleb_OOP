package car;

import interfaces.CarInterfaces;

/**
 *
 * @author Rafy1
 */
public class Car implements CarInterfaces{
    String color, noPlate, brand;
    int widht;
    int height;
    
    public Car(String color, String noPlate, String brand, int widht, int height){
        this.color = color;
        this.noPlate = noPlate;
        this.brand = brand;
        this.widht = widht;
        this.height = height;
    };
    
    @Override
    public void displayCar(){
        System.out.println("Brand Mobil: " + brand);
        System.out.println("Warna Mobil: " + color);
        System.out.println("No plate Mobil: " + noPlate);
        System.out.println("Lebar Mobil: " + widht);
        System.out.println("Tinggi Mobil: " + height);
    }
    
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin");
    };
    
    @Override
    public void Throttle() {
        System.out.println("Gass...");
    };
    
    @Override
    public void Brake() {
        System.out.println("Rem...");
    };
    
    @Override
    public void turnOnHeadLamp() {
        System.out.println("Menyalakan Lampu");
    };
    
    @Override
    public void turnOfHeadLamp() {
        System.out.println("Mematikan Lampu");
    };
}
