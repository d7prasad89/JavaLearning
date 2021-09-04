package javaFundamentals;

public class CargoFlight extends Flight {
    public int cargoSeats = 70;

    public void addPassengers(){
        System.out.println("Inside derieved class");
    }

    public CargoFlight(int seats, int cargoSeats) {
        super(seats);
        this.cargoSeats = cargoSeats;
    }
}
