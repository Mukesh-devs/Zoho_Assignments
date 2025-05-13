class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public void start(){
        System.out.println("Vehicle is started!");
    }

    public void stop(){
        System.out.println("Vehicle is turned off!");
    }
}


class TwoWheeler extends Vehicle {
    public TwoWheeler(String brand, int speed) {
        super(brand, speed);
    }
    public void start(){
        System.out.println("TwoWheeler is Started!");
    }

    public void stop(){
        System.out.println("TwoWheeler is turned Off");
    }
}


class Bike extends TwoWheeler {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    public void bikeFeature() {
        System.out.println(brand + " Bike has a sporty look.");
    }
    public void start(){
        System.out.println("Bike is Started!");
    }

    public void stop(){
        System.out.println("Bike is turned Off");
    }
}


class Scooter extends TwoWheeler {
    public Scooter(String brand, int speed) {
        super(brand, speed);
    }

    public void scooterFeature() {
        System.out.println(brand + " Scooter is easy to ride.");
    }
    public void start(){
        System.out.println("Scooter is Started!");
    }

    public void stop(){
        System.out.println("Scooter is turned Off");
    }
}


class FourWheeler extends Vehicle {
    public FourWheeler(String brand, int speed) {
        super(brand, speed);
    }
    public void start(){
        System.out.println("FourWheeler is Started!");
    }

    public void stop(){
        System.out.println("FourWheeler is turned Off");
    }
}


class Car extends FourWheeler {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void carFeature() {
        System.out.println(brand + " Car has air conditioning.");
    }
    public void start(){
        System.out.println("Car is Started!");
    }

    public void stop(){
        System.out.println("Car is turned Off");
    }
}


class Truck extends FourWheeler {
    public Truck(String brand, int speed) {
        super(brand, speed);
    }

    public void truckFeature() {
        System.out.println(brand + " Truck can carry heavy loads.");
    }
    public void start(){
        System.out.println("Truck is Started!");
    }

    public void stop(){
        System.out.println("Truck is turned Off");
    }
}


class Q2 {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", 120);
        bike.displayInfo();
        bike.bikeFeature();
        bike.start();
        bike.stop();

        Scooter scooter = new Scooter("Honda", 80);
        scooter.displayInfo();
        scooter.scooterFeature();
        scooter.start();
        scooter.stop();

        Car car = new Car("Toyota", 180);
        car.displayInfo();
        car.carFeature();
        car.start();
        car.stop();

        Truck truck = new Truck("Volvo", 100);
        truck.displayInfo();
        truck.truckFeature();
        truck.start();
        truck.stop();
    }
}

