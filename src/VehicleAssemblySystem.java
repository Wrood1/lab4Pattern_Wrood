//Create an interface for vehicles
interface Vehicle {
    void displaySpecifications();
}
//Create classes for each vehicle type that implement the interface
class Car implements Vehicle {
    private int doors;
    private String engineType;
    private String cargoCapacity;
    public Car(int doors, String engineType, String cargoCapacity) {
        this.doors = doors;
        this.engineType = engineType;
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void displaySpecifications() {
        System.out.println("Car with " + doors + " doors, Engine: " + engineType + ", Cargo Capacity: " + cargoCapacity);
    }
}

class Truck implements Vehicle {
    private String cargoCapacity;
    private String engineType;
    public Truck(String cargoCapacity, String engineType) {
        this.cargoCapacity = cargoCapacity;
        this.engineType = engineType;
    }
    @Override
    public void displaySpecifications() {
        System.out.println("Truck with Cargo Capacity: " + cargoCapacity + ", Engine: " + engineType);
    }
}

class Motorcycle implements Vehicle {
    private String engineType;
    public Motorcycle(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public void displaySpecifications() {
        System.out.println("Motorcycle with Engine: " + engineType);
    }
}
//Create an abstract factory interface
interface VehicleFactory {
    Vehicle createVehicle();
}
//Create concrete factory classes for each vehicle type
class CarFactory implements VehicleFactory {
    private int doors;
    private String engineType;
    private String cargoCapacity;
    public CarFactory(int doors, String engineType, String cargoCapacity) {
        this.doors = doors;
        this.engineType = engineType;
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public Vehicle createVehicle() {
        return new Car(doors, engineType, cargoCapacity);
    }
}

class TruckFactory implements VehicleFactory {
    private String cargoCapacity;
    private String engineType;
    public TruckFactory(String cargoCapacity, String engineType) {
        this.cargoCapacity = cargoCapacity;
        this.engineType = engineType;
    }
    @Override
    public Vehicle createVehicle() {
        return new Truck(cargoCapacity, engineType);
    }
}

class MotorcycleFactory implements VehicleFactory {
    private String engineType;
    public MotorcycleFactory(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle(engineType);
    }
}

public class VehicleAssemblySystem {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory(4, "V6", "Medium");
        Vehicle car = carFactory.createVehicle();
        car.displaySpecifications();
        
        VehicleFactory truckFactory = new TruckFactory("Large", "Diesel");
        Vehicle truck = truckFactory.createVehicle();
        truck.displaySpecifications();

        VehicleFactory motorcycleFactory = new MotorcycleFactory("500cc");
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.displaySpecifications();
    }
}
