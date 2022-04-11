package Itinery.Manifest;

import People.Person;
import People.passenger.Passenger;

import java.util.ArrayList;

public class PassengerManifest extends Manifest {

    private ArrayList<Passenger> passengerManifest;

    public PassengerManifest() {
        super();
        this.passengerManifest = new ArrayList<>();
    }

    public void addPassengerToManifest(Passenger passenger) {
        this.passengerManifest.add(passenger);
    }

    public ArrayList<Passenger> getPassengerManifest() {
        return this.passengerManifest;
    }

    public Passenger getPassengerFromManifestIndex(int manifestIndex){
        return this.passengerManifest.get(manifestIndex);
    }
    public int getTotal() {
        return this.passengerManifest.size();
    }
}
