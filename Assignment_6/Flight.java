package Assignment_6;

import java.time.LocalDateTime;

public class Flight {

    private int flightId;
    private String airline;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;
    private int seatCapacity;
    private boolean isAvailable;

    Flight(int flightId) {
        this.flightId = flightId;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
        this.isAvailable = seatCapacity > 0;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAirline() {
        return airline;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "flightId \t: " + getFlightId() + 
        "\nairline \t: " + getAirline() + 
        "\nSeat Capacity \t: " + getSeatCapacity() +
        "\nprice \t\t: " + getPrice() + 
        "\nsource \t\t: " + getSource() + 
        "\ndestination \t: " + getDestination() +
        "\ndeparture Time \t: " + getDepartureTime() +
        "\narrival Time  \t: " + getArrivalTime() + 
        "\nFlight Available \t: " + isAvailable();
     }
}