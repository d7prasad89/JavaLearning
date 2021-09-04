package tddJunit.mileage;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import tddJunit.tddJunit5.BusinessFlight;
import tddJunit.tddJunit5.EconomyFlight;
import tddJunit.tddJunit5.Flight;
import tddJunit.tddJunit5.Passenger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightArgumentConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        assertEquals(String.class, source.getClass(), "Can only covert from String");
        assertEquals(Flight.class, targetType, "Can only convert to Flight");

        String[] flightString = source.toString().split(";");
        Flight flight = null;

        switch (flightString[1].toLowerCase().trim()) {
            case "b": flight = new BusinessFlight(1, "Business");
                break;
            case "e" : flight = new EconomyFlight(2, "Economy");
                break;
        }

        flight.addPassengers(new Passenger(flightString[2].trim(), Boolean.valueOf(flightString[3].trim())));
        flight.setDistance(Integer.valueOf(flightString[4].trim()));
        return flight;
    }
}
