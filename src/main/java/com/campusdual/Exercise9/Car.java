package com.campusdual.Exercise9;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;
    private String fuelType;
    private int speedometer;
    private int tachometer;

    public Car(String brand, String model, int maxSpeed, String fuelType){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.speedometer = 0;
        this.tachometer = 0;
    }

    public void start(){}
    public void turnOff(){}
    public void speedUp(){}
    public void slowDown(){}
    public void turn(){}
    public void goBack(){}

}
