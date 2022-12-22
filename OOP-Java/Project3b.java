package project8;

import java.util.*;

class Vehicle {
    String vehicle_no;
    long fuel_capacity;
    float fuel_consumption;
    Scanner S = new Scanner(System.in);
    void read(){
        System.out.printf("Enter Vehicle number: ");
        vehicle_no = S.next();
        System.out.printf("Enter Fuel Capacity: ");
        fuel_capacity = S.nextLong();
        System.out.printf("Enter Fuel Consumption: ");
        fuel_consumption = S.nextFloat();
    }
}

class Truck extends Vehicle {
    long cargo_capacity;
    void read() {
        super.read();
        System.out.printf("Enter Cargo Capacity: ");
        cargo_capacity = S.nextLong();
    }
    void display() {
        System.out.println("Vehicle No: "+vehicle_no);
        System.out.println("Fuel Capacity: "+fuel_capacity);
        System.out.println("Fuel Consumption: "+fuel_consumption);
        System.out.println("Cargo Capacity: "+cargo_capacity+"\n");
    }
}

class Bus extends Vehicle {
    long seating_capacity;
    void read() {
        super.read();
        System.out.printf("Enter Seating Capacity: ");
        seating_capacity = S.nextLong();
    }
    void display() {
        System.out.println("Vehicle No: "+vehicle_no);
        System.out.println("Fuel Capacity: "+fuel_capacity);
        System.out.println("Fuel Consumption: "+fuel_consumption);
        System.out.println("Seating Capacity: "+seating_capacity);
    }
}

public class Project8 {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bus bus = new Bus();
        System.out.println("Truck:");
        truck.read();
        truck.display();
        System.out.println("Bus:");
        bus.read();
        bus.display();
    }
}
