package javaFundamentals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flight implements Iterable<Passenger>{
    public int seats = 120;
    List<Passenger> passengerList = new ArrayList<>();

    public Flight() {
        System.out.println("Inside No args constructor of Flight class");
    }

    public Flight(int seats) {
        this.seats = seats;
    }

    public void addFlight(Passenger passenger) {
        passengerList.add(passenger);
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }
}
