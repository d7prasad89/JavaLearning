package javaFundamentals;

public class MethodOverloading {
    public static void main(String[] args) {
        FlightUtils flightUtils = new FlightUtils();
        flightUtils.addPassengers(3);

        //Base class derived class check
        Flight f = new CargoFlight(11, 22);
        System.out.println(f.seats); // Base class reference can access only fields which are known by the base class.

        CargoFlight cf = new CargoFlight(33, 44);
        System.out.println(cf.seats); // Access to both base and derived field members and methods.
    }
}
