package ru.ivmiit;

public class Truck extends Car {
    private int load;

    public Truck(String brand, String model, String color, int midSpeed, int weight,
                 int fuelConsumption, int load) {
        super (brand, model, color, midSpeed, weight, fuelConsumption);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int newLoad) {
        load = newLoad;
    }
}
