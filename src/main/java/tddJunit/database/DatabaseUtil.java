package tddJunit.database;


import tddJunit.tddJunit5.BusinessFlight;
import tddJunit.tddJunit5.EconomyFlight;
import tddJunit.tddJunit5.Flight;
import tddJunit.tddJunit5.Passenger;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private DatabaseUtil() {

    }

    public static List<Flight> buildFlightsList(List<List<String>> queriedData) {
        List<Flight> flightList = new ArrayList<>();
        for(List<String> row: queriedData) {
            Flight flight = null;
            if(row.get(1).equals("e")) {
                flight = new EconomyFlight(Integer.parseInt(row.get(0)), "Economy");
            } else if(row.get(1).equals("b")) {
                flight = new BusinessFlight(Integer.parseInt(row.get(0)), "Business");
            }
            flight.addPassengers(new Passenger(row.get(2), Boolean.valueOf(row.get(3))));
            flight.setDistance(Integer.valueOf(row.get(4)));
            flightList.add(flight);
        }
        return flightList;
    }
}
