package javaFundamentals;

public class FlightUtils {
    public void addPassengers(){
        System.out.println("Inside add Passengers()");
    }

    public void addPassengers(int a) {
        addPassengers();
        System.out.println("Inside add Passengers(a)");
        test();
    }

    public void test(){
        System.out.println("test");
    }
}
