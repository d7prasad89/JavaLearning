package tddJunit.tddJunit5;

public class EconomyFlight extends Flight{

    public EconomyFlight(int id, String flightType) {
        super(id, flightType);
    }

    @Override
    public boolean addPassengers(Passenger passenger) {
        if(passenger.isVipStatus()){
            return false;
        }
        return this.getPassengerSet().add(passenger);
    }
}
