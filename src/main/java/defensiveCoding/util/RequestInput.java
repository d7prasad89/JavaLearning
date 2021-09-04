package defensiveCoding.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RequestInput {
    private String from;
    private String to;
    private int passengerCount;
    private LocalDate departDate;

    public void getRequestInput(String[] args) {
        if(args.length != 4) {
            throw new IllegalArgumentException("The argument length should be equal to 4");
        }
        this.from = validateStringInput(args[0]);
        this.to = validateStringInput(args[1]);
        this.passengerCount = validateIntegerInput(args[2]);
        this.departDate = validateDate(args[3]);

    }

    private LocalDate validateDate(String arg) {
        String date = validateStringInput(arg);
        return parseInputDate(date);
    }

    private LocalDate parseInputDate(String departDate) {
        LocalDate date;
        try {
            date = LocalDate.parse(departDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Could not parse input Date %s, " + "Please input a date in format " +
                    "dd-mm-yyyy", departDate), e);
        }
        return date;
    }

    public String validateStringInput(String arg) {
        if(arg == null && arg.isEmpty()) {
            throw new IllegalArgumentException("input argument can't be empty");
        }
        return arg;
    }

    public int validateIntegerInput(String arg) {
        int passengerNum = 0;
        try {
            passengerNum = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid Integer. Input argument for passengerCount should be 1 to 7");
        }
        if(passengerNum < 1 || passengerNum > 7) {
            throw new IllegalArgumentException("Invalid Integer. Input argument for passengerCount should be 1 to 7");
        }
        return passengerNum;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public LocalDate getDepartDate() {
        return departDate;
    }

    public void setDepartDate(LocalDate departDate) {
        this.departDate = departDate;
    }

}
