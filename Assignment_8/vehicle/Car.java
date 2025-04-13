package Assignment_8.vehicle;

public class Car extends Vehicle {
    private String model;
    private int year;

    public Car(String brand, String model, int year,String fuelType) {
        super(brand,fuelType);
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [brand=" + getBrandName() + ", model=" + model + ", year=" + year + "]";
    }
}
