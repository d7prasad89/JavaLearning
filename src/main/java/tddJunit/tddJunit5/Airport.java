package tddJunit.tddJunit5;

public class Airport {
    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight(1, "Economy");
        Flight businessFlight = new BusinessFlight(2, "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        businessFlight.addPassengers(john);
        economyFlight.addPassengers(mike);

        for (Passenger passenger: economyFlight.getPassengerSet()) {
            System.out.println(passenger.getName());
        }
    }
}
