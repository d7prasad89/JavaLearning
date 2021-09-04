package defensiveCoding;

import defensiveCoding.flights.FlightStore;
import defensiveCoding.flights.service.FlightService;
import defensiveCoding.model.Flight;
import defensiveCoding.util.FlowCheck;
import defensiveCoding.util.RequestInput;

import java.util.List;

public class App {
    public static void main(String[] args) {
        RequestInput requestInput = new RequestInput();
        requestInput.getRequestInput(args);
        FlightService flightService = new FlightService(new FlightStore());
        List<Flight> search = flightService.search(requestInput);
        System.out.println(search);
        //FlowCheck
        FlowCheck flowCheck = new FlowCheck();
        flowCheck.bigLoop();
        flowCheck.smallFun();
    }
}
