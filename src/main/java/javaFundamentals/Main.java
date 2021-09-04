package javaFundamentals;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(120);
        flight.addFlight(new Passenger("Adam"));
        flight.addFlight(new Passenger("Smith"));
        flight.addFlight(new Passenger("Richard"));
        for (Passenger p: flight
             ) {
            System.out.println(p.name);
        }
    }
}
