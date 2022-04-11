package Itinery;

import Itinery.Manifest.Manifest;
import Itinery.Manifest.PassengerManifest;
import People.passenger.Passenger;
import Plane.Plane;

import java.util.ArrayList;

public class Flight {

    private Manifest flightAttendantManifest;
    private Manifest pilotManifest;
    protected PassengerManifest passengerManifest;

    private String flightNumber;
    private String destination;
    private String departingAirport;
    private String departureTime;
    private Plane plane;

    public Flight(Manifest pilotManifest, Manifest flightAttendantManifest, PassengerManifest passengerManifest,
                  String flightNumber, String destination, String departingAirport, String departureTime,
                  Plane plane){
        this.pilotManifest = pilotManifest;
        this.flightAttendantManifest = flightAttendantManifest;
        this.passengerManifest = passengerManifest;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingAirport = departingAirport;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public Manifest getPilotManifest() {
        return pilotManifest;
    }

    public Manifest getFlightAttendantManifest(){
        return flightAttendantManifest;
    }

    public Manifest getPassengerManifest() {
        return passengerManifest;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfFreeSeats() {
        int numberOfPassengers;
        int numberOfSeats;

        numberOfSeats = plane.getNumberOfSeats();
        numberOfPassengers = passengerManifest.getTotal();
        return (numberOfSeats - numberOfPassengers);
    }

    public String bookSeat(Passenger passenger) {
        int availableSeats;
        String passengerName;

        availableSeats = getNumberOfFreeSeats();

       if (availableSeats > 0) {
           passengerManifest.addPassengerToManifest(passenger);
           passengerName = passenger.getName();
           return "Seat booked for " + passengerName;
       } else {
           return "No seats available";
       }
    }

    public int calculateWeightDistributionPerPassenger() {
        int numberOfPassengers;
        int planeCargoLimit;

        numberOfPassengers = passengerManifest.getTotal();
        planeCargoLimit = plane.getCargoWeightLimit();
        return planeCargoLimit / numberOfPassengers;
    }

    public int calculateBaggageWeightForPassenger(){

        Passenger passenger;
        int numberOfBags;
        int averageBagWeight = 15;

        passenger = passengerManifest.getPassengerFromManifestIndex(0);
        numberOfBags = passenger.getNumberOfBags();

        return numberOfBags * averageBagWeight;
    }
    

}
