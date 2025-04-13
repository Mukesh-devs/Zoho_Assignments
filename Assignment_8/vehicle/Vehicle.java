package Assignment_8.vehicle;

public class Vehicle {
    private String brandName;
    private String fuelType;

    public Vehicle(String brandName, String fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
    public String getBrandName() {
        return brandName;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void engineStart() {
        System.out.println("Vehicle has startes... ");
    }

    public void engineStop() {
        System.out.println("Vehicle has stopes... ");
    }

    
}
