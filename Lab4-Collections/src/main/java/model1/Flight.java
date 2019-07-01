package model1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String flightNumber;
    private String origin;
    private String destination;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Flight_id")
    private List<Passenger> passengers;
    private int passengersOnBoard;
    private int numSeats;

    public Flight(String origin, String destination,int passengersOnBoard, int numSeats,String flightNumber) {
        this.origin = origin;
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.passengersOnBoard = passengersOnBoard;
        this.numSeats = numSeats;
        this.flightNumber = flightNumber;
    }



    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getPassengersOnBoard() {
        return passengersOnBoard;
    }

    public void setPassengersOnBoard(int passengersOnBoard) {
        this.passengersOnBoard = passengersOnBoard;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
