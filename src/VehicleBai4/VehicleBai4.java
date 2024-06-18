package VehicleBai4;

public class VehicleBai4 {
    abstract static class VehicleBai4 {
        String model;
        double fuelEfficiency;
        double distanceTraveled;
        double maxSpeed;

        public Vehicle(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
            this.model = model;
            this.fuelEfficiency = fuelEfficiency;
            this.distanceTraveled = distanceTraveled;
            this.maxSpeed = maxSpeed;
        }

        public void displayInfo() {
            System.out.println("Model: " + model);
            System.out.println("Fuel Efficiency: " + fuelEfficiency + " mpg");
            System.out.println("Distance Traveled: " + distanceTraveled + " miles");
            System.out.println("Max Speed: " + maxSpeed + " mph");
        }
    }

    static class Truck extends Vehicle {
        public Truck(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
            super(model, fuelEfficiency, distanceTraveled, maxSpeed);
        }
    }

    static class Car extends Vehicle {
        public Car(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
            super(model, fuelEfficiency, distanceTraveled, maxSpeed);
        }
    }

    static class Motorcycle extends Vehicle {
        public Motorcycle(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
            super(model, fuelEfficiency, distanceTraveled, maxSpeed);
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Tatra 810 4x4", 8.075659532105526, 65.50975012444003, 80.0);
        Car car = new Car("Virtus", 2.355, 14.419665, 120.0);
        Motorcycle motorcycle = new Motorcycle("Warrior200", 2.1, 4.41, 80.0);

        System.out.println("Truck:");
        truck.displayInfo();
        System.out.println();

        System.out.println("Car:");
        car.displayInfo();
        System.out.println();

        System.out.println("Motorcycle:");
        motorcycle.displayInfo();
        System.out.println();
    }
}