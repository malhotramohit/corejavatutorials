package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;


 abstract class Vehicle {

    private final String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Vehicle)) return false;

        Vehicle that = (Vehicle) o;

        return color.equals(that.color);
    }

}

 class Bicycle extends Vehicle {

    public Bicycle(String color) {
        super(color);
    }

}

 class Car extends Vehicle {

    private final String model;

    public Car(String color, String model) {
        super(color);
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Car)) return false;

        Car that = (Car) o;

        return getColor().equals(that.getColor()) && model.equals(that.model);
    }

}
public class Test {
public static void main(String[] args) {
	Bicycle bicycle = new Bicycle("blue");
	Car car = new Car("blue", "Mercedes");

	System.out.println(bicycle.equals(car));// <- true
	System.out.println(car.equals(bicycle));// <- false
}
}
