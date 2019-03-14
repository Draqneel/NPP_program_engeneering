package ru.ivmiit;

public class Main {
    public static void main(String[] args){
        Car car = new Car("BMW", "X5", "red", 150, 2135, 8);
        Car newCar = new Car();
        Car anotherCar = new Car();
        //System.out.println("Color of car: " + car.getColor() + " Weight of car: " + car.getWeight());
        Truck truck = new Truck("Lada", "Kalina", "Baklajan", 50, 1500, 9, 1000);
        System.out.println(truck.getColor());

        Car[] cars = new Car[10];
        cars[0] = truck;
        cars[1] = car;
        cars[2] = newCar;
        cars[3] = anotherCar;

    }
}


