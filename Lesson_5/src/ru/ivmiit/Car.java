package ru.ivmiit;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int midSpeed;
    private int weight;
    private int fuelConsumption;

    public Car(String brand, String model, String color, int midSpeed, int weight,
               int fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.midSpeed = midSpeed;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
    }

    public Car(){
        this(null,null,null,0,0,0);
    }

    public double getFuelByDistace(int distance) {
        return (distance / 100.0) * fuelConsumption;
    }

    public double getTimeByDistance(int distance) {
        return distance / (double) midSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor(){
        return color;
    }

    public void setMidSpeed(int newSpeed) {
        midSpeed = newSpeed;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
