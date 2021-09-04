package defensiveCoding.model;

import java.time.LocalDate;

public class Flight {

    private String fromDest;
    private String toDest;
    private int seatsAvailable;
    private LocalDate date;

    public Flight(String fromDest, String toDest, int seatsAvailable, LocalDate date) {
        this.fromDest = fromDest;
        this.toDest = toDest;
        this.seatsAvailable = seatsAvailable;
        this.date = date;
    }

    public String getFromDest() {
        return fromDest;
    }

    public void setFromDest(String fromDest) {
        this.fromDest = fromDest;
    }

    public String getToDest() {
        return toDest;
    }

    public void setToDest(String toDest) {
        this.toDest = toDest;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromDest='" + fromDest + '\'' +
                ", toDest='" + toDest + '\'' +
                ", seatsAvailable=" + seatsAvailable +
                ", date=" + date +
                '}';
    }
}
